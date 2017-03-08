package com.hanbit.helloapp.domain;

/**
 * Created by hanbit on 2017-03-08.
 */

public class CalcBean {
    protected int firstNum,SecondNum;

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return SecondNum;
    }

    public void setSecondNum(int secondNum) {
        SecondNum = secondNum;
    }

    @Override
    public String toString() {
        return "CalcBean{" +
                "firstNum=" + firstNum +
                ", SecondNum=" + SecondNum +
                '}';
    }
}
