package com.mrig.spring.springcore.reftype;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    private Score score;

}
