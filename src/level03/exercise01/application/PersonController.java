package level03.exercise01.application;

import level03.exercise01.enums.MenuOptionsMain;
import level03.exercise01.enums.SortType;
import level03.exercise01.utils.ConsoleUtils;
import static level03.exercise01.enums.SortType.*;

/**
 * PROGRAM: PersonController
 * AUTHOR:  Diego Balaguer
 * DATE:    18/04/2025
 */

public class PersonController {

    private final PersonWorkers personWorkers;

    public PersonController() {
        this.personWorkers = new PersonWorkers();
    }

    public void menu() {

        do {
            try {
                MenuOptionsMain.viewMenu();
                MenuOptionsMain idMenu = MenuOptionsMain.values()[ConsoleUtils.readRequiredInt("") - 1];
                switch (idMenu) {
                    case EXIT -> {
                        return;
                    }
                    case PERSON_ADD -> addPerson();
                    case SHOW_NAME_ASC -> showList(NAME_ASC);
                    case SHOW_NAME_DES -> showList(NAME_DES);
                    case SHOW_SURNAME_ASC -> showList(SURNAME_ASC);
                    case SHOW_SURNAME_DES -> showList(SURNAME_DES);
                    case SHOW_DNI_ASC -> showList(DNI_ASC);
                    case SHOW_DNI_DES -> showList(DNI_DES);
                    default -> System.out.println("Error: Invalid option.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid option.");
            }
        } while (true);
    }

    private void addPerson() {
        System.out.println(System.lineSeparator() + "ADD PERSON..................");
        personWorkers.addPerson();
        System.out.println();
    }

    private void showList(SortType sortType) {

        StringBuilder message = new StringBuilder();

        switch (sortType) {
            case NAME_ASC -> message.append("LIST SORT NAME ASCENDING.......");
            case NAME_DES -> message.append("LIST SORT NAME DESCENDING.......");
            case SURNAME_ASC -> message.append("LIST SORT SURNAME ASCENDING.......");
            case SURNAME_DES -> message.append("LIST SORT SURNAME DESCENDING.......");
            case DNI_ASC -> message.append("LIST SORT DNI ASCENDING.......");
            case DNI_DES -> message.append("LIST SORT DNI DESCENDING.......");
            default -> message.append("Invalid option.");
        }
        message.append(System.lineSeparator());
        message.append(personWorkers.showSorted(sortType));
        System.out.println(message);
    }
}


