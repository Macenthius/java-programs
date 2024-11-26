public class AMAss{
    public static void main(String[] args){
        int noofitem = 50;
        float costperitem = 9.99f;
        float totalcost = noofitem*costperitem;
        char currency = '$';

        System.out.println("No of items :" +noofitem);
        System.out.println("cost per item:" +costperitem+currency);
        System.out.println("Total cost" +totalcost+currency);
    }
}