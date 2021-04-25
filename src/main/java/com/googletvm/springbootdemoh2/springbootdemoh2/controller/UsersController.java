package com.googletvm.springbootdemoh2.springbootdemoh2.controller;

import com.googletvm.springbootdemoh2.springbootdemoh2.model.User;
import com.googletvm.springbootdemoh2.springbootdemoh2.repository.UserJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UsersController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsersController.class);

    @Autowired
    UserJpaRepository userJpaRepository;

    @GetMapping(value = "/all")
    public List<User> findAll() {
        LOGGER.info("Before hitting findAll...");
        return userJpaRepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public User findByName(@PathVariable final String name) {
        return userJpaRepository.findByName(name);
    }

    @GetMapping(value = "/namelike/{nameText}")
    public User findByNameContaining(@PathVariable final String nameText) {
        return userJpaRepository.findByNameContaining(nameText);
    }

    @PostMapping("/load/")
    public User load(@RequestBody final User user) {
        userJpaRepository.save(user);
        return userJpaRepository.findByName(user.getName());
    }




}
