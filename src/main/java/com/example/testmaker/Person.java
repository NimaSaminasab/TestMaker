package com.example.testmaker;

import jakarta.persistence.*;

import java.util.Set;


@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id ;
    String name ;
    @OneToMany(mappedBy = "person")
    Set<PersonQuestion> personQuestionsList ;

    public Person(){}
    public Person(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
