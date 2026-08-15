import java.time.*;
import java.time.format.DateTimeFormatter;

public class Assignment13_1 {

    public static void main(String[] args) {

        // Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date : " + today);

        // Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time : " + time);

        // Current Date and Time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date & Time : " + now);

        // Specific Date
        LocalDate birthday = LocalDate.of(2005, 10, 15);
        System.out.println("Birthday : " + birthday);

        // Add Days
        System.out.println("After 10 Days : " + today.plusDays(10));

        // Add Months
        System.out.println("After 2 Months : " + today.plusMonths(2));

        // Add Years
        System.out.println("After 1 Year : " + today.plusYears(1));

        // Subtract Days
        System.out.println("Before 15 Days : " + today.minusDays(15));

        // Day of Week
        System.out.println("Day of Week : " + today.getDayOfWeek());

        // Day of Year
        System.out.println("Day of Year : " + today.getDayOfYear());

        // Leap Year
        System.out.println("Is Leap Year? " + today.isLeapYear());

        // Compare Dates
        LocalDate examDate = LocalDate.of(2026, 12, 20);
        if(today.isBefore(examDate))
            System.out.println("Exam is yet to come.");

        // Formatting
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Formatted : " + now.format(formatter));

        // Parse Date
        LocalDate date = LocalDate.parse("2026-12-25");
        System.out.println("Parsed Date : " + date);
    }
}