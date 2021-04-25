package com.googletvm.springbootdemoh2.springbootdemoh2.model;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * @Entity annotation indicates that the class is a persistent Java class.
 * – @Table annotation provides the table that maps this entity.
 * – @Id annotation is for the primary key.
 * – @GeneratedValue annotation is used to define generation strategy for the primary key. GenerationType.AUTO means Auto Increment field.
 * – @Column annotation is used to define the column in database that maps annotated field.
 *
 */

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "teamname")
    private String teamName;

    @Column(name = "salary")
    private Integer salary;

    public User() { }

    public User(Long id, String name, String teamName, Integer salary) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", salary=" + salary +
                '}';
    }





}
