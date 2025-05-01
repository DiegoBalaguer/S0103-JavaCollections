package level01.exercise02.application;

import java.util.List;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 16/04/2025
 */

public class ApplicationController {

    List<Integer> numbersFirst;
    List<Integer> numbersSecond;

    public void run() {

        System.out.println("PROCESS STARTED...");

        System.out.println(System.lineSeparator() + "Creation of a first random integer numbers list....");
        numbersFirst = ListWorkers.generateRandomIntegerList();
        System.out.println(numbersFirst);

        System.out.println(System.lineSeparator() + "Sort from smaller to bigger integer numbers list....");
        ListWorkers.sortListIntegersAscending(numbersFirst);
        System.out.println(numbersFirst);

        System.out.println(System.lineSeparator() + "Creation of a second random integer numbers list....");
        numbersSecond = ListWorkers.generateRandomIntegerList();
        System.out.println(numbersSecond);

        System.out.println(System.lineSeparator() + "Sort from smaller to bigger second integer numbers list....");
        ListWorkers.sortListIntegersAscending(numbersSecond);
        System.out.println(numbersSecond);

        System.out.println(System.lineSeparator() + "Insert into second list the first list inverted....");
        ListWorkers.appendReversedListToAnother(numbersFirst, numbersSecond);
        System.out.println(numbersSecond);
    }
}