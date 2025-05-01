package level02.exercise02.application;

import level02.exercise02.model.Restaurant;

/**
 * PROGRAM: ApplicationController
 * AUTHOR:  Diego Balaguer
 * DATE:    18/04/2025
 */

public class ApplicationController {

    private RestaurantWorkers restaurantWorkers;

    public ApplicationController() {

        restaurantWorkers = new RestaurantWorkers();
    }

    public void run() {
        System.out.println("* TASKS WITH RESTAURANT......................");

        System.out.println("** Load initial list of restaurants.................");
        restaurantWorkers.loadRestaurantsIntoSet();

        System.out.println("** Initial list of restaurants......................");
        System.out.println(restaurantWorkers.listRestaurants());

        System.out.println("** List after inserting new restaurant............");
        restaurantWorkers.setRestaurant(new Restaurant("Restaurante Siete Lunas", 6));
        System.out.println(restaurantWorkers.listRestaurants());

        System.out.println("** we tried to insert 'Restaurante Siete Lunas' again..............");

        System.out.println("** Insert 'Restaurante Siete Lunas' in the HashSet: " + restaurantWorkers.setRestaurant(new Restaurant("Restaurante Siete Lunas", 6)) + ", the HashSet don't allow duplicates");
        System.out.println("** Insert 'La cuineta del bon menjar' with rating 7 in the HashSet: " + restaurantWorkers.setRestaurant(new Restaurant("La cuineta del bon menjar", 7)));
        System.out.println("** Insert 'La cuineta del bon menjar' with rating 8 in the HashSet: " + restaurantWorkers.setRestaurant(new Restaurant("La cuineta del bon menjar", 8)));

        System.out.println("** List of Restaurants in HashSet using Iterator................");
        System.out.println(restaurantWorkers.listRestaurants());
    }
}

