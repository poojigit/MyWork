package InterviewPrep;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Before Swapping:\nx="+x+"\ny="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping\nx="+x+"\ny="+y );
    }
}
