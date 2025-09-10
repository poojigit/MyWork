package InterviewPrep;


import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit*digit*digit;
            n=n/10;
            //System.out.println(sum);
        }
        if(sum==temp){
            System.out.println("It is an armstrong number");
        }else{
            System.out.println("It is not an armstrong number");
        }
    }
}
