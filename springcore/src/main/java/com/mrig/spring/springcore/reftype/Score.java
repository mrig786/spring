package com.mrig.spring.springcore.reftype;

public class Score {
    private int math;
    private int phy;
    private int chm;

    @Override
    public String toString() {
        return "Score{" +
                "math=" + math +
                ", phy=" + phy +
                ", chm=" + chm +
                '}';
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {
        this.phy = phy;
    }

    public int getChm() {
        return chm;
    }

    public void setChm(int chm) {
        this.chm = chm;
    }
}
