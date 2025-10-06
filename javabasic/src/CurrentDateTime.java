import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentDateTime {

    public static void date(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");//Java DateTimeFormatter helps in uniformly parsing and printing the date-time objects in various inbuilt and custom formatting patterns.
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dtf.format(now));

        Date date = new Date();
        System.out.println("Current Date: " + date);//Date() gets the current date and time

    }
}
