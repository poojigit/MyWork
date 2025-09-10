package InterviewPrep;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        int a,b,c;
        System.out.println("Enter the values of a and b");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before Swapping\na="+a+"\nb ="+b);

        c=a;
        a=b;
        b=c;
        System.out.println("After Swapping \na="+a+"\nb ="+b);
    }
}
