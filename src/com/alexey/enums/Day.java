package com.alexey.enums;

/**
 * Created by NewClass7 on 21.08.2015.
 */
public enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public boolean isItBadDay (Day day){
        if (day == Day.MONDAY){
            return true;
        } else {
            return false;
        }
    }
}
