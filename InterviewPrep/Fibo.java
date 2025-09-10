package InterviewPrep;


import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n:");
        int first, second;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the value of first and second");
        first=sc.nextInt();
        second=sc.nextInt();
        for(int i=0;i<n;i++){
            int next=first+second;
            System.out.println(next);
            first=second;
            second=next;
        }

    }
}