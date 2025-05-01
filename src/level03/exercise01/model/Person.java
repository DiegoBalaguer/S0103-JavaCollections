package level03.exercise01.model;

/**
 * PROGRAM: Person
 * AUTHOR: Diego Balaguer
 * DATE: 18/04/2025
 */

public class Person {

    private String name;
    private String surname;
    private String dni;

public Person(String name, String surname, String dni) {
    this.name = name;
    this.surname = surname;
    this.dni = dni;
}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-20s %-10s", name, surname, dni);
    }
}
