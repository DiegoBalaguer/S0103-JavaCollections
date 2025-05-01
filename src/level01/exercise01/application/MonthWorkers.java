package level01.exercise01.application;

import level01.exercise01.data.MonthDataLoader;
import level01.exercise01.model.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * PROGRAM: MonthWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 15/04/2025
 */

public class MonthWorkers {

    private ArrayList<Month> months;
    private HashSet<Month> monthHashSet;

    public MonthWorkers() {
        months = new ArrayList<Month>();
    }

    public void loadMonthsIntoArrayList() {
        MonthDataLoader monthDataLoader = new MonthDataLoader();
        monthDataLoader.loadMonthList(months);
    }

    public String listMonths() {
        StringBuilder message = new StringBuilder();

        message.append(System.lineSeparator()).append("LIST OF MONTHS.............").append(System.lineSeparator());

        for (Month month : months) {
            message.append(month.toString()).append(System.lineSeparator());
        }
        return message.toString();
    }

    public String listMonthsWithIterator() {
        StringBuilder message = new StringBuilder();
        message.append(System.lineSeparator()).append("LIST OF MONTHS ITERATOR.............").append(System.lineSeparator());

        Iterator<Month> iteratorMonth = months.iterator();
        while (iteratorMonth.hasNext()) {
            message.append(iteratorMonth.next()).append(System.lineSeparator());
            }
        return message.toString();
    }

    public void setMonths(int index, Month month) {
        months.add(index, month);
    }

    public void convertArrayToHashSet() {
        monthHashSet = new HashSet<>(months);
    }

    public String listMonthsInHash() {
        StringBuilder message = new StringBuilder();
        message.append(System.lineSeparator()).append("LIST OF MONTHS IN HASHSET.............").append(System.lineSeparator());

        for (Month month : monthHashSet) {
            message.append(month.toString()).append(System.lineSeparator());
        }
        return message.toString();
    }

    public String listMonthsInHashWithFor() {
        StringBuilder message = new StringBuilder();
        message.append(System.lineSeparator()).append("LIST OF MONTHS.............").append(System.lineSeparator());

        for (Month month : monthHashSet) {
            message.append(month.toString()).append(System.lineSeparator());
        }
        return message.toString();
    }

    public String listMonthsInHashWithIterator() {
        StringBuilder message = new StringBuilder();
        message.append(System.lineSeparator()).append("LIST OF MONTHS ITERATOR.............").append(System.lineSeparator());

        Iterator<Month> iteratorMonth = monthHashSet.iterator();
        while (iteratorMonth.hasNext()) {
            message.append(iteratorMonth.next()).append(System.lineSeparator());
        }
        return message.toString();
    }

    public boolean addMonthHashSet(Month month) {
        return monthHashSet.add(month);
    }
}
