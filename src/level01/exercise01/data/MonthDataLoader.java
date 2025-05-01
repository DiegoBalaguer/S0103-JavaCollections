package level01.exercise01.data;

import java.util.ArrayList;
import level01.exercise01.model.Month;

/**
 * PROGRAM: MonthDataLoader
 * AUTHOR: Diego Balaguer
 * DATE: 15/04/2025
 */

public class MonthDataLoader {

    public void loadMonthList(ArrayList<Month> months) {
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

    }
}
