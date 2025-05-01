package level03.exercise01.enums;

/**
 * PROGRAM: MenuOptionsMain
 * AUTHOR: Diego Balaguer
 * DATE: 18/04/2025
 */

public enum MenuOptionsMain {

    PERSON_ADD("Add person."),
    SHOW_NAME_ASC("Show sorted by name (A-Z)."),
    SHOW_NAME_DES("Show sorted by name (Z-A)."),
    SHOW_SURNAME_ASC("Show sorted by surname (A-Z)."),
    SHOW_SURNAME_DES("Show sorted by surname (Z-A)."),
    SHOW_DNI_ASC("Show sorted by DNI (1-9)."),
    SHOW_DNI_DES("Show sorted by DNI (9-1)."),
    EXIT("Exit");

    private final String description;

    // Constructor del enum
    MenuOptionsMain(String d) {
        this.description = d;
    }

    public String getDescription() {
        return description;
    }

    public static void viewMenu() {
        System.out.println(System.lineSeparator() + "PERSONS" + System.lineSeparator());
        for (MenuOptionsMain o : MenuOptionsMain.values()) {
            System.out.println(o.ordinal() + 1 + ". " + o.getDescription());
        }
        System.out.print(System.lineSeparator() + "Choose an option: ");
    }
}