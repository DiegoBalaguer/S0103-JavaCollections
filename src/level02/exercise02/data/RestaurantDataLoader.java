package level02.exercise02.data;

import level02.exercise02.model.Restaurant;

import java.util.Set;

/**
 * PROGRAM: RestaurantDataLoader
 * AUTHOR:  Diego Balaguer
 * DATE:    18/04/2025
 */

public class RestaurantDataLoader {

    public void loadRestaurantSet(Set<Restaurant> restaurants) {
        restaurants.add(new Restaurant("Casa Angelita", 5));
        restaurants.add(new Restaurant("El camarote", 8)); // allowed
        restaurants.add(new Restaurant("El raco d'en Paco", 6));
        restaurants.add(new Restaurant("Masia Can Borrell", 7));
    }
}
