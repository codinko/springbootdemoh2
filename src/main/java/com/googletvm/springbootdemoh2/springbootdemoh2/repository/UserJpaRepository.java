package com.googletvm.springbootdemoh2.springbootdemoh2.repository;

import com.googletvm.springbootdemoh2.springbootdemoh2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {

    /*
    The implementation is plugged in by Spring Data JPA automatically.

    findBy'POJO_Propertyname' is the naming convention if you want Spring Data JPA to provide implementation automatically.
    If you give a name like findByAdipoliName(..) Spring throws error :)
    org.springframework.data.mapping.PropertyReferenceException: No property adipoliName found for type User!

     */
    User findByName(String name);

    User findByNameContaining(String nameChars);
}
