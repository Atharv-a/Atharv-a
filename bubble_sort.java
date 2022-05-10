import java.util.Scanner;

public class bubble_sort { // time complexity O(n^2)

    public static void bubble(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n - 1; j++) {

                if (a[j] > a[j + 1]) {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                    c = 1; // if inner loop doesn't make a swap then it implies that the array is sorted,
                           // so we need to just print the array
                }

            }
            if (c == 0) {
                break;
            }

            for (int k : a)
                System.out.print(k + " ");
            System.out.print("\n");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        bubble(arr);

    }

}
