import java.util.*;

public class CalendarMax {
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();

        int max = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum Number of Days in the Week : " +max);

        max = calendar.getMaximum(Calendar.DAY_OF_YEAR);
        System.out.print("Maximum Number of Days in the Year: " +max);
    }
}
