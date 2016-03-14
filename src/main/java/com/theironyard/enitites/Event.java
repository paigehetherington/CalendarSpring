package com.theironyard.enitites;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by vajrayogini on 3/14/16.
 */
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String description;

    @Column(nullable = false)
    LocalDateTime dateTime;

    public Event(String description, LocalDateTime dateTime) {
        this.description = description;
        this.dateTime = dateTime;
    }

    public Event() {  //blank constructor for hibernate when doing queries like findAll
    }
}
