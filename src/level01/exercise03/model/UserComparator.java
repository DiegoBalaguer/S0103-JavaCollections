package level01.exercise03.model;


import java.util.Comparator;

/**
 * PROGRAM: UserComparator
 * AUTHOR:  Diego Balaguer
 * DATE:    16/04/2025
 */

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User user01, User user02) {
        int scoreComparison = Integer.compare(user02.getScore(), user01.getScore());
        if (scoreComparison == 0) {
            return user01.getName().compareToIgnoreCase(user02.getName());
        }
        return scoreComparison;
    }
}