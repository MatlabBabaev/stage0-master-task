package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        try {
            int division = dividend / divider;
            int i = division * divider;
            if (i == dividend)
                System.out.println("can be divided completely");
            else
                System.out.println("cannot be divided completely");
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
    }

}
