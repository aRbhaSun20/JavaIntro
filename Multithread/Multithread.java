import java.util.*;

class Second implements Runnable {
    public int x;

    public Second(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("Second thread : Square of a number" + x * x);
    }
}

class Third implements Runnable {
    public int x;

    public Third(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("Third thread : Cube of a number" + x * x * x);
    }
}

class First extends Thread {
    public void run() {
        int num = 0;
        Random rn = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                num = rn.nextInt(20);
                System.out.println("First thread : Generation of a number" + num);
                Thread t2 = new Thread(new Second(num));
                t2.start();
                Thread t3 = new Thread(new Third(num));
                t3.start();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        First a = new First();
        a.start();
    }
}