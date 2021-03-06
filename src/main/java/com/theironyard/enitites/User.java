package com.theironyard.enitites;

import javax.persistence.*;

/**
 * Created by vajrayogini on 3/14/16.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false, unique = true)
    String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }
}
