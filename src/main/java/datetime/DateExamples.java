package datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateExamples {
  public static void main(String[] args) {
    LocalDate today = LocalDate.of(2018, 10, 8);
    System.out.println(today);
    LocalDate threeDaysFromNow = today.plus(3, ChronoUnit.DAYS); // maybe?? also, didn't assign!!!
    LocalDate tomorrow = today.plusDays(1);
    System.out.println("tomorrow is " + tomorrow);
    System.out.println("3 days from now is " + threeDaysFromNow);
    System.out.println("3 days ago was " + today.minus(3, ChronoUnit.DAYS));
    System.out.println("today is still " + today);
  }
}
