package level01.exercise03.model;

import level01.exercise03.application.FileWorkers;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

/**
 * PROGRAM: ScoreList
 * AUTHOR:  Diego Balaguer
 * DATE:    16/04/2025
 */

public class ScoreList {

    private Set<User> users;
    private static FileWorkers fileWorkers;

    public ScoreList() {
        users = new TreeSet<>(new UserComparator());
        fileWorkers = new FileWorkers();
        loadFromFile();
    }

    public void addUser(User newUser) {
        users.add(newUser);
    }

    public Set<User> getUsers() {
        return users;
    }

    public void loadFromFile() {
        try {
            users.addAll(fileWorkers.loadScores());
        } catch (IOException e) {
            System.err.println("Error loading scores: " + e.getMessage());
        }
    }

    public void saveToFile() {
        try {
            fileWorkers.saveScores(users);
        } catch (IOException e) {
            System.err.println("Error saving scores: " + e.getMessage());
        }
    }
}

