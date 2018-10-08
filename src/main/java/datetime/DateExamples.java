package datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd MMMMM yyyyy");
    System.out.println("today, English, is " + fmt.format(today));

    Period oneMonth = Period.of(0, 1, 0);
    LocalDate nextMonth = today.plus(oneMonth);
    System.out.println("Next month is " + nextMonth);
    LocalDate feb8 = LocalDate.of(2018, 2, 8);
    LocalDate feb8PlusOneMonth = feb8.plus(oneMonth);
    System.out.println("feb 8 is " + feb8);
    System.out.println("feb 8 plus one month is " + feb8PlusOneMonth);

    Period longish = Period.of(1, 18, 379);
    Period tidy = longish.normalized();
    System.out.println("longish " + longish);
    System.out.println("tidy " + tidy);
/*
/*
  A) P1Y18M379D
  B) P2Y6M379D
  C) P3Y6M14D
  D) Crash!
 */
  }
}
