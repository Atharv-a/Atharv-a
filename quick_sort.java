import java.util.Scanner;

public class quick_sort { // average case time O(n*logn) Based on Divide And Conquer
    static void swap(int[] a, int low, int high) {
        int temp = a[low];
        a[low] = a[high];
        a[high] = temp;

    }

    static int partition(int[] a, int low, int high) {
        int partition = a[high];
        int vartochange = low;
        for (int i = low; i <= high; i++) {
            if (a[i] < partition) {
                swap(a, i, vartochange);
                vartochange++;
            }
        }
        swap(a, high, vartochange);
        return vartochange;                               

    }

    static void sort(int[] a, int low, int high) {
        if (low < high) {
            int partition = partition(a, low, high);

            sort(a, low, partition - 1);
            sort(a, partition + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();
        sort(a, 0, a.length - 1);
        for (int i : a)
            System.out.print(i + " ");

    }
}
