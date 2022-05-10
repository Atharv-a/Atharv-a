import java.util.Scanner;

public class insertion_sort { // Time complexity o(n^2)
    static void insertion(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j - 1] > a[j]) {
                    a[j - 1] = a[j - 1] + a[j];
                    a[j] = a[j - 1] - a[j];
                    a[j - 1] = a[j - 1] - a[j];
                }
            }
            for (int k : a)
                System.out.print(k + " ");
            System.out.print("\n");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        insertion(arr);
    }
}
