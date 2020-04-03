import java.util.*;

public class Mergesort {

    static int max = 10;

    void merge(int a[], int low, int mid, int high) {
        int i, j, k, resarray[];
        i = low;
        k = low;
        j = mid + 1;
        resarray = new int[max];
        
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                resarray[k] = a[i];
                i++;
                k++;
            } else {
                resarray[k] = a[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            resarray[k++] = a[i++];
        }

        while (j <= high) {
            resarray[k++] = a[j++];
        }

        for (int m = low; m < high; m++) {
            a[m] = resarray[m];
        }
    }

    void sort(int a[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(a, low, mid);
            sort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int a[];

        System.out.println("enter the array size");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[max];
        Random rn = new Random();

        for (int j = 0; j < n; j++) {
            a[j] = rn.nextInt(20);
        }

        System.out.println("array before sort");

        for (int j = 0; j < n; j++) {
        System.out.println(a[j]);
        }

        long startTime = System.nanoTime();
        Mergesort m = new Mergesort();
        m.sort(a, 0, n - 1);
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;

        System.out.println("time elapsed " + elapsedTime + " ns");

        System.out.println("array after sort");

        for (int j = 0; j < n; j++) {
        System.out.println(a[j]);
        }

        sc.close();
    }

}