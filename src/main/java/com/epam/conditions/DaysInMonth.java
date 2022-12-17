package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(month==2 && year==1900)
            System.out.println("28");
        else if(month<=0 || month>12 || year<0)
            System.out.println("invalid date");
        else if(month==2){
            System.out.println(year%4==0?"29":"28");
        }
        else if(month>=8 && month%2==0 || month<8 && month%2==1)
            System.out.println("31");
        else System.out.println("30");
    }

}
