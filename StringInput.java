import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String a = sc.next();
        System.out.print("Enter b string with fill line = ");
        System.out.println("Word is = "+a);
        String b = sc.nextLine();
        System.out.println("Word is = "+b);
        System.out.println("Max the " +
                "great");
    }
}
