package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UtilityFunctions {

    /**
     * @return A String with day of week, the date and the time e.g. Tuesday May 19 18:42
     */
    public static String getHumanFriendlyDateTimeString() {
        LocalDate today = LocalDate.now();
        return today.getDayOfWeek().name() + " " +
                today.getMonth().name() + " " +
                today.getDayOfMonth() + " " +
                LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);
    }

    public static List<String> getWeekDays() {
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        return weekDays;
    }

    public static List<String> getFruit() {
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Apple");
        weekDays.add("Banana");
        weekDays.add("Cherry");
        weekDays.add("Date");
        weekDays.add("Elderberry");
        weekDays.add("Fig");
        weekDays.add("Grape");
        return weekDays;
    }
}
