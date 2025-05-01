package level03.exercise01.enums;

import level03.exercise01.model.Person;

import java.util.Comparator;

/**
 * PROGRAM: SortType
 * AUTHOR: Diego Balaguer
 * DATE: 18/04/2025
 */

public enum SortType {
    NAME_ASC(Comparator.comparing(Person::getName)),
    NAME_DES(Comparator.comparing(Person::getName).reversed()),
    SURNAME_ASC(Comparator.comparing(Person::getSurname)),
    SURNAME_DES(Comparator.comparing(Person::getSurname).reversed()),
    DNI_ASC(Comparator.comparing(Person::getDni)),
    DNI_DES(Comparator.comparing(Person::getDni).reversed());

    private final Comparator<Person> comparator;

    SortType(Comparator<Person> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Person> getComparator() {
        return comparator;
    }
}