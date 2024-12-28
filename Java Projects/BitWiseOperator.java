public class BitWiseOperator {
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        System.out.println("a & b = " + (a & b)); // AND

        System.out.println("a | b = " + (a | b)); // OR
        
        System.out.println("a ^ b = " + (a ^ b)); // XOR
        
        System.out.println("~a = " + (~a)); // will give 2's complement of 5 = - 6.
        
        a &= b;
        System.out.println("a = "+a); /*can also be combined with assignment 
                                        operator to provide shorthand assignment */
    }
}