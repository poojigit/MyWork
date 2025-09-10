package InterviewPrep;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x= sc.nextInt();
        System.out.println("Enter the value of y:");
        y= sc.nextInt();
        System.out.println("Enter the value of z:");
        z=sc.nextInt();
        if(x>y && x>z)
            System.out.println("First number is largest number");
        else if (y>x && y>z)
            System.out.println("Second number is largest number");
        else if (z>x && z>y)
            System.out.println("Third number is largest number");
        else
            System.out.println("Numbers are not distinct");


    }
}
