package level01.exercise03.model;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;

/**
 * PROGRAM: CountriesPlayed
 * AUTHOR:  Diego Balaguer
 * DATE:    16/04/2025
 */

public class CountriesPlayed {

    private Set<String> countries;

    public CountriesPlayed() {
        countries = new HashSet<>();
    }

    public void addCountry(String country) {
        if (!countries.add(country)) {
            throw new InputMismatchException("Country already exists (" + country + ")");
        }
    }
}
