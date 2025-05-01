package level01.exercise03.application;

import level01.exercise03.enums.MenuOptionsMain;
import level01.exercise03.model.ScoreList;
import level01.exercise03.utils.ConsoleUtils;

import java.io.IOException;

/**
 * PROGRAM: ApplicationController
 * AUTHOR:  Diego Balaguer
 * DATE:    16/04/2025
 */

public class ApplicationController {

    private ScoreList scoreList;

    public ApplicationController() {
        scoreList = new ScoreList();
    }

    public void run() {

        do {
            MenuOptionsMain.printMenu();
            int answer = ConsoleUtils.readRequiredInt("");
            try {
                MenuOptionsMain idMenu = MenuOptionsMain.values()[answer - 1];
                switch (idMenu) {
                    case EXIT -> {
                        ConsoleUtils.closeScanner();
                        return;
                    }
                    case PLAY_GAME -> playGame();
                    case VIEW_SCORE -> viewScore();
                    default -> throw new IllegalArgumentException("Unexpected value: " + idMenu);
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                System.err.println("Error: Unexpected value." + e.getMessage());
            }
        } while (true);
    }

    private void playGame() {
        try {
            GameWorkers game = new GameWorkers(scoreList);
            game.startGame();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private void viewScore() {

        ScoreViewPrinter.printScoreList(scoreList);
    }
}
