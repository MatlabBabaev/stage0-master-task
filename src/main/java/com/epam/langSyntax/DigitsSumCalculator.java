package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum;
        for(sum=0; number!=0; number=number/10){
            sum+=number%10;
        }
        System.out.println(sum);
    }

}
