package level01.exercise03.model;

import level01.exercise03.utils.NumberUtils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * PROGRAM: CountriesCapitalController
 * AUTHOR:  Diego Balaguer
 * DATE:    16/04/2025
 */

public class CountriesCapitalController {

    private HashMap<String, String> countryCapitalMap;
    ArrayList<String> paises;

    public CountriesCapitalController(HashMap<String, String> countryCapitalMap) {
        this.countryCapitalMap = countryCapitalMap;
        this.paises = new ArrayList<>(countryCapitalMap.keySet());
    }

    public String getRandomCountry() {
        return paises.get(NumberUtils.random(0, paises.size() - 1));
    }

    public String getCountryCapital(String country) {
        return countryCapitalMap.get(country);
    }
}
