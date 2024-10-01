package com.example.hibernateerror;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Generated;

@Entity
public class TestEntity {
    @Id
    @Generated(writable = true)
    private Long id;
}
