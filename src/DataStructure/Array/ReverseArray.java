package DataStructure.Array;

import java.util.Arrays;
import java.util.Scanner;

/*
* Space complexity is o(1)-- no extra array is used.
* Time complexity is o(n/2)=o(n)
*/

public class ReverseArray {
    public static void reverseArray(int[]arr){
        int left=0, right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter " +size+ " integers");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        reverseArray(arr);
        System.out.println("Reversed array is:" +Arrays.toString(arr));
        sc.close();
    }
}
