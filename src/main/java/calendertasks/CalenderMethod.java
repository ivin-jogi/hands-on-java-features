package calendertasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;


public class CalenderMethod {
  public boolean checkForLeapYear(int year, int month, int date, String day) {
    LocalDate reqDate = LocalDate.of(year, month, date);
    System.out.println("Given date is : " + reqDate);
    return reqDate.isLeapYear();
  }

  public boolean checkForDay(int year, int month, int date, String day) {
    LocalDate reqDate = LocalDate.of(year, month, date);
    DayOfWeek exactDay = reqDate.getDayOfWeek();
    System.out.println("Day of the Given date is : " + exactDay);
    boolean checkDay = exactDay.equals(day);
    return checkDay;
  }

  public int getNoOfDaysInMonth(int year, int month, int date, String day) {
    LocalDate reqDate = LocalDate.of(year, month, date);
    Month givenMonth = reqDate.getMonth();
    System.out.println("Given Month is : " + givenMonth);
    YearMonth reqMonth = YearMonth.of(year, month);
    LocalDate lastDay = reqMonth.atEndOfMonth();
    System.out.println("Lasy day of " + givenMonth + " is " + lastDay);
    return reqMonth.lengthOfMonth();
  }

  public int getWeekNum(int year, int month, int date, String day) {
    LocalDate reqDate = LocalDate.of(year, month, date);
    WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY, 1);
    TemporalField week = weekFields.weekOfMonth();
    int weekNum = reqDate.get(week);
    return weekNum;
  }


}