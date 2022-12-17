package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        System.out.println(monthNumber < 1 || monthNumber > 12
                ? "Wrong month number":
                monthNumber < 3 || monthNumber == 12
                ? "Winter" : monthNumber <6
                ? "Spring" : monthNumber < 9
                ? "Summer" : "Autumn");
    }

}
