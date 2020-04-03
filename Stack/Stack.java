import java.util.*;

class Stack {
    int max = 10;
    int s[] = new int[max];
    int top = -1;

    void push(int ele) {
        if (top >= max - 1) {
            System.out.println("stack overflow");
        } else {
            s[++top] = ele;
        }
    }

    int pop() {
        int z = 0;
        if (top == -1) {
            System.out.println("stack empty");
        } else {
            z = s[top--];
        }
        return z;
    }

    void display() {
        if (top == -1) {
            System.out.println("stack overflow");
        } else {
            for (int i = top; i > -1; i--) {
                System.out.println(s[i] + " ");
            }
        }
    }

    public static void main(String args[]) {
        int q = 1;
        Stack m = new Stack();
        System.out.println("program to perform stack operation");
        Scanner sc = new Scanner(System.in);

        while (q != 0) {
            System.out.println("1.push 2.pop 3.display");
            System.out.println("enter your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter the element to push");
                    int ele = sc.nextInt();
                    m.push(ele);
                    break;
                case 2:
                    int popele = m.pop();
                    System.out.println("the element to pop" + popele);
                    break;
                case 3:
                    System.out.println("the element to display");
                    m.display();
                    break;
                default:
                    q = 0;
                    break;
            }
        }
        sc.close();
    }
}