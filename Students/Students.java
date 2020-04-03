import java.util.*;

 class Student {
    String USN, Name, Branch;
    int phone;

    void insertRecord(String reg, String nam, String brnch, int ph) {
        USN = reg;
        Name = nam;
        Branch = brnch;
        phone = ph;
    }

    void displayRecord() {
        System.out.println(USN + " " + Name + " " + Branch + " " + phone);
    }
}


public class Students{
    public static void main(String args[]){
        Student s[] = new Student[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
        }
        for (int j = 0; j < n; j++) {
            System.out.println("enter the usn,name,branch,phone");
            String usn = sc.next();
            String name = sc.next();
            String branch = sc.next();
            int phone = sc.nextInt();
            s[j].insertRecord(usn,name,branch,phone);
        }
        for (int m = 0; m < n; m++ ) {
            s[m].displayRecord();
        }
        sc.close();
    }
}