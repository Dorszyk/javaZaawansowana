package TypWyliczeniowy.Ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Saturday is holiday: " + Weekday.SATURDAY.isHoliday());
        System.out.println("Friday is weekday: " + Weekday.FRIDAY.isWeekDay());
        Weekday.MONDAY.whichIsGreater(Weekday.MONDAY);
        Weekday.TUESDAY.whichIsGreater(Weekday.TUESDAY);
        Weekday.WEDNESDAY.whichIsGreater(Weekday.FRIDAY);
    }
}
