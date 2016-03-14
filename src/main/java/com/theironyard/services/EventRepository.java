package com.theironyard.services;

import com.theironyard.enitites.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by vajrayogini on 3/14/16.
 */
public interface EventRepository extends CrudRepository<Event, Integer> { //first type repository source, 2nd type is id
    List<Event> findAllByOrderByDateTimeDesc(); //to see most recent first
}
