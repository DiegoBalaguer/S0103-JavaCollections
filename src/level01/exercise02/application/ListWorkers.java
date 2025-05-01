package level01.exercise02.application;

import level01.exercise02.utils.NumberUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * PROGRAM: ListWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 16/04/2025
 */

public class ListWorkers {

    public static List<Integer> generateRandomIntegerList() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(NumberUtils.random(1, 100));
        }
        return numbers;
    }

    public static void sortListIntegersAscending(List<Integer> numbers) {
        Collections.sort(numbers);
    }

    public static void appendReversedListToAnother(List<Integer> numbersFirst, List<Integer> numbersSecond) {
        List<Integer> reversed = new ArrayList<>(numbersFirst);
        Collections.reverse(reversed);
        numbersSecond.addAll(reversed);
    }
}
