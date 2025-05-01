package level01.exercise03.enums;

/**
 * PROGRAM: MenuOptionsMain
 * AUTHOR: Diego Balaguer
 * DATE: 16/04/2025
 */

public enum MenuOptionsMain {

    PLAY_GAME("Play game."),
    VIEW_SCORE("View score."),
    EXIT("Exit");

    private final String description;

    // Constructor del enum
    MenuOptionsMain(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void printMenu() {
        System.out.println(System.lineSeparator() + "GAME CAPITALS" + System.lineSeparator());
        for (MenuOptionsMain optionMenu : MenuOptionsMain.values()) {
            System.out.println(optionMenu.ordinal() + 1 + ". " + optionMenu.getDescription());
        }
        System.out.println(System.lineSeparator() + "Choose an option: ");
    }
}
