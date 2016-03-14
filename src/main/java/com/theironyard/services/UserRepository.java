package com.theironyard.services;

import com.theironyard.enitites.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vajrayogini on 3/14/16.
 */

public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String name);

}
