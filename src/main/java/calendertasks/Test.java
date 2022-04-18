package calendertasks;

public class Test {
  public static void main(String[] args) {
    CalenderMethod calender = new CalenderMethod();
    System.out.println("Year of given date is a Leap Year : " + calender.checkForLeapYear(2022, 4, 5, "THURSDAY"));
    System.out.println("Given day is same is for the given date : " + calender.checkForDay(2022, 4, 5, "THURSDAY"));
    System.out.println("Number of days in the given month : " + calender.getNoOfDaysInMonth(2022, 4, 5, "THURSDAY"));
    System.out.println("Week Number of the month in given date : " + calender.getWeekNum(2022, 4, 5, "THURSDAY"));

  }
}
