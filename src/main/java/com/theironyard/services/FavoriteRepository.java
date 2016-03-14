package com.theironyard.services;

import com.theironyard.enitites.Favorite;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vajrayogini on 3/14/16.
 */
public interface FavoriteRepository extends CrudRepository<Favorite, Integer> {
}
