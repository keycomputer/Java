import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Assignment13 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current Date : " + date);
        System.out.println("Current Time : " + time);
        System.out.println("Current Date & Time : " + dateTime);
    }
}
