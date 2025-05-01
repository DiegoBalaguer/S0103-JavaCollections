package level02.exercise02.application;

import level02.exercise02.data.RestaurantDataLoader;
import level02.exercise02.model.Restaurant;
import level02.exercise02.model.RestaurantComparator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * PROGRAM: RestaurantWorkers
 * AUTHOR:  Diego Balaguer
 * DATE:    18/04/2025
 */

public class RestaurantWorkers {

    private Set<Restaurant> restaurants;

    public RestaurantWorkers() {
        restaurants = new TreeSet<>(new RestaurantComparator());
    }

    public void loadRestaurantsIntoSet() {
        RestaurantDataLoader restaurantDataLoader = new RestaurantDataLoader();
        restaurantDataLoader.loadRestaurantSet(restaurants);
    }

    public String listRestaurants() {
        StringBuilder message = new StringBuilder();
        message.append(System.lineSeparator()).append("LIST OF RESTAURANTS.............").append(System.lineSeparator());

        Iterator<Restaurant> iteratorRestaurant = restaurants.iterator();
        while (iteratorRestaurant.hasNext()) {
            message.append(iteratorRestaurant.next()).append(System.lineSeparator());
        }
        return message.toString();
    }

    public boolean setRestaurant(Restaurant restaurant) {
        return restaurants.add(restaurant);
    }
}
