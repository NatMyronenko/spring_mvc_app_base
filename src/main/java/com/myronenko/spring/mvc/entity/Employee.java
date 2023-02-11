package com.myronenko.spring.mvc.entity;

import java.lang.annotation.Repeatable;

@Entity
@Repeatable(name="employees")
public class Employee {
    @Id
    private int id;
    private String name;
    private String surname;
    private String department;
    private int salary;
}
