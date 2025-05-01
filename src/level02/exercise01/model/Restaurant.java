package level02.exercise01.model;

import java.util.Objects;

/**
 * PROGRAM: Restaurant
 * AUTHOR:  Diego Balaguer
 * DATE:    18/04/2025
 */

public class Restaurant {

    private String name;
    int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Restaurant)) return false;
        Restaurant restaurant = (Restaurant) obj;
        return this.name.equals(restaurant.name) && this.rating == restaurant.rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name + rating);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}

