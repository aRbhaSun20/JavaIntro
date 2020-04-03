import java.util.*;


public class Quicksort {

    static int max = 10;

    int partition(int a[], int low, int high) {
        int pivot, i, j, temp;
        pivot = a[low];
        i = low + 1;
        j = high;
        while (low < high) {
            while (a[i] <= pivot && i < high) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            } else {
                temp = a[low];
                a[low] = a[j];
                a[j] = temp;
            }
            return j;
        }
        return j;
    }

    void sort(int a[], int low, int high) {
        if (low < high) {
            int s = partition(a, low, high);
            sort(a, low, s - 1);
            sort(a, s + 1, high);
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
        Quicksort m = new Quicksort();
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