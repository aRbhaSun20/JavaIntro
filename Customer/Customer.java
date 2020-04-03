import java.util.*;

public class Customer{
    String name;
    String date;

    void read() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        date = sc.nextLine();
        sc.close();
    }

    void display() {
        System.out.println(name + " ");
        String delim = "/";
        StringTokenizer st = new StringTokenizer(date, delim);
        while (st.hasMoreElements()) {
            System.out.print(st.nextElement() + ",");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of customer");
        int n = sc.nextInt();
        System.out.println("enter the customer details");
        Customer cus[] = new Customer[10];
        for (int i = 0; i < n; i++) {
            cus[i] = new Customer();
            cus[i].read();
        }
        for (int i = 0; i < n; i++) {
            cus[i].display();
        }
        sc.close();
    }
}