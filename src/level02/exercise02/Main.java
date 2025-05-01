package level02.exercise02;

import level02.exercise02.application.ApplicationController;

/**
 * PROGRAM: Main
 * AUTHOR:  Diego Balaguer
 * DATE:    18/04/2025
 */

public class Main {

    public static void main(String[] args) {

        ApplicationController applicationController = new ApplicationController();

        applicationController.run();
        System.out.println("PROCESS FINISHED...");
    }
}