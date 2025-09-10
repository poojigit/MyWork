package InterviewPrep;


import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n,rev=0;
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("Reversed number is: " +rev);
    }
}
