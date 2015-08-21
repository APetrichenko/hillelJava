package com.alexey.enums;

/**
 * Created by NewClass7 on 21.08.2015.
 */
public class DayTest {
    Day day;

    public DayTest(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }


    public boolean isItBadDay (Day day){
        if (day == Day.MONDAY){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        DayTest dayTest = new DayTest(Day.MONDAY);
        System.out.println();

        DayTest firstDay = new DayTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        DayTest thirdDay = new DayTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        DayTest fifthDay = new DayTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        DayTest sixthDay = new DayTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        DayTest seventhDay = new DayTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();


    }

}
