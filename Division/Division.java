import java.util.*;

public class Division {
    public static void main(String[] args) {
        float a, b,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b");
        a = sc.nextFloat();
        b = sc.nextFloat();
        try {
            result = a / b;
            System.out.println("Result " + result);
        } catch (ArithmeticException e) {
            System.out.println("exception caught division error" + e);
        }
        sc.close();
    }
}