package InterviewPrep;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n:");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int result=1;
        for(int i=1;i<=n;i++){
             result=result*i;
            System.out.println(i);
        }
        System.out.println(result);

    }
}
