package DataStructure.Sorting;



import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input array size
        System.out.print("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        //Enter the elements of array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //logic of bubble sort

        for (int pass = 0; pass < n - 1; pass++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - pass; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

                System.out.println(Arrays.toString(arr));
            }
            if (!swapped) break;
        }
    }
}
