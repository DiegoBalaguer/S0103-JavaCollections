package level03.exercise01.application;

import level03.exercise01.model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * PROGRAM: FileWorkers
 * AUTHOR:  Diego Balaguer
 * DATE:    18/04/2025
 */

public class FileWorkers {


private final File FILE_PERSONS = new File("src/level03/exercice01/resources/people.csv");

    public List<Person> readPeoples() throws IOException {
        List<Person> people = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(FILE_PERSONS));
        String lineFile;

        while ((lineFile = reader.readLine()) != null) {
            String[] parts = lineFile.split(",");
            if (parts.length == 3) {
                String name = parts[0].trim();
                String surname = parts[1].trim();
                String dni = parts[2].trim();
                people.add(new Person(name, surname, dni));
            }
        }
        reader.close();
        return people;
    }
}