import java.util.*;

public class CalendarGet {
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Current Calendar Year : " + calendar.get(Calendar.YEAR));
        System.out.println("Current Calender's Day: " + calendar.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));

    }
}
