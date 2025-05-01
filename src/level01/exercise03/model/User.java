package level01.exercise03.model;

import java.util.ArrayList;

/**
 * PROGRAM: User
 * AUTHOR:  Diego Balaguer
 * DATE:    16/04/2025
 */

public class User {
    private String name;
    private int score;

    public User(String name) {
        this.name = name;
        this.score = 0;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore() {
        this.score++;
    }

    public ArrayList<String> toScoreRow() {
        ArrayList<String> lineUser = new ArrayList<>();
        lineUser.add(name);
        lineUser.add(String.valueOf(score));
        return lineUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}