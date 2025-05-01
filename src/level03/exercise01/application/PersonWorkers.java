package level03.exercise01.application;
import level03.exercise01.enums.SortType;
import level03.exercise01.model.Person;
import level03.exercise01.utils.ConsoleUtils;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * PROGRAM: PersonWorkers
 * AUTHOR:  Diego Balaguer
 * DATE:    18/04/2025
 */

public class PersonWorkers {

    private List<Person> people;

    public PersonWorkers() {
        people = new ArrayList<>();
        loadPersons();
    }

    public void loadPersons() {
        try {
            FileWorkers fileWorkers = new FileWorkers();
            people.addAll(fileWorkers.readPeoples());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void addPerson() {
        String name = inputName();
        String surname = inputSurname();
        String dni = inputDni();
        people.add(new Person(name, surname, dni));
        System.out.println("Added Person.");
    }

    private String inputName() {
        return ConsoleUtils.readRequiredString("Name: ");
    }

    private String inputSurname() {
        return ConsoleUtils.readRequiredString("Surname: ");
    }

    private String inputDni() {
        return ConsoleUtils.readRequiredString("DNI: ");
    }

    public String showSorted(SortType sortType) {
        StringBuilder message = new StringBuilder();
        message.append(System.lineSeparator())
                .append("___Name___________ ___Surname____________ __DNI__")
                .append(System.lineSeparator());

        if (sortType != null) {
            sort(sortType.getComparator()).forEach(p -> message.append(p).append(System.lineSeparator()));
        } else {
            message.append("Invalid option!").append(System.lineSeparator());
        }
        return message.toString();
    }

    private List<Person> sort(Comparator<Person> comparator) {
        return people.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
