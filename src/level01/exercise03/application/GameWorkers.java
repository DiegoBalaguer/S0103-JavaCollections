package level01.exercise03.application;

import level01.exercise03.model.CountriesCapitalController;
import level01.exercise03.model.CountriesPlayed;
import level01.exercise03.model.ScoreList;
import level01.exercise03.model.User;
import level01.exercise03.utils.ConsoleUtils;

import java.io.IOException;

/**
 * PROGRAM: GameWorkers
 * AUTHOR:  Diego Balaguer
 * DATE:    16/04/2025
 */

public class GameWorkers {

    private final FileWorkers fileWorkers;
    private final CountriesCapitalController countries;
    private ScoreList scores;
    private User user;
    private CountriesPlayed countriesPlayed;

    public GameWorkers(ScoreList scores) throws IOException {
        fileWorkers = new FileWorkers();
        countries = new CountriesCapitalController(fileWorkers.readCountries());
        this.scores = scores;
        user = new User(enterUserName());
        countriesPlayed = new CountriesPlayed();
    }

    public void startGame() {

        for (int i = 0; i < 10; i++) {
            try {
                String country = countries.getRandomCountry();
                countriesPlayed.addCountry(country);
                String inputUser = enterCapital(country);
                String message = "❌ Wrong! The capital is: " + countries.getCountryCapital(country);
                if (inputUser.equalsIgnoreCase(countries.getCountryCapital(country))) {
                    user.increaseScore();
                    message = "✅ Correct! (+1 point)";
                }
                System.out.println(message);
            } catch (Exception e) {
                i--;
            }
        }
        finishGame();
    }

    private String enterCapital(String country) {
        return ConsoleUtils.readValueString("Capital of " + country + "? ");
    }

    private String enterUserName() {
        return ConsoleUtils.readRequiredString("Enter your name: ");
    }

    private void finishGame() {
        System.out.println("\n🎉 " + user.getName() + ", your final score: " + user.getScore() + "/10");
        scores.addUser(user);
        scores.saveToFile();
    }
}