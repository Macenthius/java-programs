public class NumTriangle{
    public static void main(String[] args){
        int i;
        int j;
        
        for(i=1;i<=6;i++){
            for(j=1;j<=6-i;j++){
                System.out.print(" ");
            }
            for(j = 1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}