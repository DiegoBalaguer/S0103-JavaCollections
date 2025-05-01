package level01.exercise01.application;

import level01.exercise01.model.Month;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 15/04/2025
 */

public class ApplicationController {

    private MonthWorkers monthWorkers;

    public ApplicationController() {
        monthWorkers = new MonthWorkers();
    }

    public void run() {
        System.out.println("* TASKS WITH ARRAYLIST......................");

        System.out.println("** Load initial list of months excluding august.................");
        monthWorkers.loadMonthsIntoArrayList();

        System.out.println("** Initial list of months excluding august....................");
        System.out.println(monthWorkers.listMonths());

        System.out.println("** List after inserting august in correct position............");
        monthWorkers.setMonths(8-1, new Month("August"));
        System.out.println(monthWorkers.listMonths());

        System.out.println("** List of months using Iterator....................");
        System.out.println(monthWorkers.listMonthsWithIterator());

        System.out.println("* OTHERS TASKS......................");

        System.out.println("** Creation HashSet..................");
        monthWorkers.convertArrayToHashSet();

        System.out.println("** List of Months in hashSet..............");
        System.out.println(monthWorkers.listMonthsInHash());

        System.out.println("** we tried to insert January again..............");

        System.out.println("** Insert 'January' in the HashSet: " + monthWorkers.addMonthHashSet(new Month("January")) +", the HashSet don't allow duplicates");
        System.out.println("** Insert 'Enero' in the HashSet: " + monthWorkers.addMonthHashSet(new Month("Enero")));

        System.out.println("** List of Months in HashSet using for.................");
        System.out.println(monthWorkers.listMonthsInHashWithFor());

        System.out.println("** List of Months in HashSet using Iterator................");
        System.out.println(monthWorkers.listMonthsInHashWithIterator());
    }
}