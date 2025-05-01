package level02.exercise02.model;

import java.util.Comparator;

public class RestaurantComparator implements Comparator<Restaurant> {

    @Override
    public int compare(Restaurant restaurant01, Restaurant restaurant02) {
        int nameComparison = restaurant01.getName().compareToIgnoreCase(restaurant02.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(restaurant02.getRating(), restaurant01.getRating());
    }
}
