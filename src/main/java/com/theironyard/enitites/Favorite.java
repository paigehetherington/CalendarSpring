package com.theironyard.enitites;

import javax.persistence.*;

/**
 * Created by vajrayogini on 3/14/16.
 */
@Entity
@Table(name = "favorites")
public class Favorite {
    @Id
    @GeneratedValue
    int id;


    //to make favorites:
    @ManyToOne
    User user;

    @ManyToOne
    Event event;

    //@Transient (don't store in the database)
    //boolean showFavButton = false;

    public Favorite(User user, Event event) {
        this.user = user;
        this.event = event;
    }

    public Favorite() {
    }
}
