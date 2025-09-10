package InterviewPrep;


import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n % 2 ==0){
            System.out.println(n+" is even");
        }else {
            System.out.println(n+ " is odd");
        }

    }


}
