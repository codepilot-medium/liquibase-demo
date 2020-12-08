package com.codepilot.liquibase.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    long id;

    @Column(name = "FIRST_NAME", nullable = false)
    String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    String lastName;

    @Column(name = "ROLE", nullable = false)
    String role;

    @Column(name = "ADDRESS")
    String address;

    @Column(name = "PHONE_NUMBER")
    String phoneNumber;

}
