import java.util.*;

public class CalendarMin {
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();

        int min = calendar.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum Number of Days in the Week : " +min);

        min = calendar.getMinimum(Calendar.DAY_OF_YEAR);
        System.out.print("Minimum Number of Days in the Year: " +min);
    }
}
