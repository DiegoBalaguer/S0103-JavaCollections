package level03.exercise01.application;


import level03.exercise01.utils.ConsoleUtils;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 18/04/2025
 */

public class ApplicationController {

    private PersonController personController;

    public ApplicationController() {

        personController = new PersonController();
    }

    public void run() {
        personController.menu();
        ConsoleUtils.closeScanner();

    }
}