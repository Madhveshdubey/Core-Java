public class SwapWithXor {
     public static void main(String[] args) {
        int a = 10;
        int b = 5;
         System.out.println( "Before Swapping = "+" a = "+ a + "b = "+ b);
         a = (a^b);
         b = (a^b);
         a = (a^b);
         System.out.println("After Swapping A is = "+a+" b is = "+b);

         int c = 12345;
         int d = 998765;
         c = c^d;
         d = c^d;
         c = c^d;
         System.out.println( c+" "+d);
    }
}
