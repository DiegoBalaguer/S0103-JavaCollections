package level01.exercise03.application;

import level01.exercise03.model.ScoreList;
import level01.exercise03.model.User;
import level01.exercise03.utils.StringUtils;

import java.util.ArrayList;

/**
 * PROGRAM: ScoreViewPrinter
 * AUTHOR:  Diego Balaguer
 * DATE:    16/04/2025
 */

public class ScoreViewPrinter {
    public static void printScoreList(ScoreList scoreList) {
        System.out.println("**********  TABLE SCORE  *********");

        System.out.println(formatScoreHead());

        for (User user : scoreList.getUsers()) {
            System.out.println(formatScoreLine(user.toScoreRow()));
        }
    }

    private static String formatScoreHead() {

        ArrayList<String> dataLine = new ArrayList<>();
        dataLine.add("Name");
        dataLine.add("Score");
        return formatScoreLine(dataLine);
    }

    private static String formatScoreLine(ArrayList<String> dataLine) {

        int i = 0;
        return StringUtils.formatToChars(dataLine.get(i++), 16) + " \t " +
                StringUtils.formatToChars(dataLine.get(i), 15);
    }
}
