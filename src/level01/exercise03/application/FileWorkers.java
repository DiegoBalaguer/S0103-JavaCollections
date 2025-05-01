package level01.exercise03.application;

import level01.exercise03.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * PROGRAM: FileWorkers
 * AUTHOR:  Diego Balaguer
 * DATE:    16/04/2025
 */

public class FileWorkers {

    private final String basePath = System.getProperty("user.dir");
    private String fileCountries = basePath + File.separator + "src" + File.separator + "level01" + File.separator + "exercise03" +
            File.separator + "data" + File.separator + "countries.txt";
    private String fileScores =basePath + File.separator + "src" + File.separator + "level01" + File.separator + "exercise03" +
            File.separator + "data" + File.separator + "classification.txt";

    public HashMap<String, String> readCountries() throws IOException {
        HashMap<String, String> countryMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileCountries));
        String lineFile;

        while ((lineFile = reader.readLine()) != null) {
            String[] parts = lineFile.split(" ");
            if (parts.length >= 2) {
                countryMap.put(parts[0].trim().replace("_", " "), parts[1].trim().replace("_", " "));
            }
        }
        reader.close();
        return countryMap;
    }

    public void saveScoreAppend(User user) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileScores, true)); // Append mode
        writer.write(user.getName() + ": " + user.getScore() + " points\n");
        writer.close();
    }

    public ArrayList<User> loadScores() throws IOException {
        ArrayList<User> users = new ArrayList<>();
        File file = new File(fileScores);
        if (!file.exists()) return users;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileScores))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                        String name = parts[0].trim();
                        int score = Integer.parseInt(parts[1].replace("points", "").trim());
                        User user = new User(name);
                        user.setScore(score);
                        users.add(user);
                    }
                }
            }
        }
        return users;
    }

    public void saveScores(Set<User> users) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileScores))) {
            for (User user : users) {
                writer.write(user.getName() + ": " + user.getScore() + " points\n");
            }
        }
    }
}