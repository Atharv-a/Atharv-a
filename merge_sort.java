import java.util.Scanner;

public class merge_sort { // Time complexity O(n*logn) Based ON Divide And Conquer
    static void merge(int[] a, int begin, int mid, int end) {
        int size1 = mid - begin + 1;
        int size2 = end - mid;

        int[] l = new int[size1];
        int[] r = new int[size2];

        int k = 0, j = 0, i;
        for (i = begin; i < mid + 1; i++, k++)
            l[k] = a[i];

        for (i = mid + 1; i < end + 1; i++, j++)
            r[j] = a[i];

        i = 0;
        j = 0;
        k = begin;
        while (i < size1 && j < size2) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }

            k++;
        }
        while (i < size1) {
            a[k] = l[i];
            k++;
            i++;
        }

        while (j < size2) {
            a[k] = r[j];
            k++;
            j++;
        }
        for (int m : a)
            System.out.print(m + " ");
        System.out.print("\n");

    }

    static void sortdiv(int[] a, int begin, int end) {
        if (end <= begin)
            return;
        int mid = (begin + end) / 2;
        sortdiv(a, begin, mid);
        sortdiv(a, mid + 1, end);
        merge(a, begin, mid, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sortdiv(a, 0, a.length - 1);
        sc.close();
        for (int k : a)
            System.out.print(k + " ");
        System.out.print("\n");
    }
}
