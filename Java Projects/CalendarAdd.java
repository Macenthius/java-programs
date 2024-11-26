import java.util.*;

public class CalendarAdd{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, - 15);
        System.out.println("15 Days Ago was : " +cal.getTime());
        cal.add(Calendar.MONTH, 4);
        System.out.println("4 Months ago : " +cal.getTime());
        cal.add(Calendar.YEAR, 2);
        System.out.print("2 Year Later " +cal.getTime());
    }
}