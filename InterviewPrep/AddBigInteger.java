package InterviewPrep;

import java.math.BigInteger;
import java.util.Scanner;

public class AddBigInteger {
    public static void main(String[] args) {
        String a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=sc.nextLine();
        System.out.println("Enter the value of b");
        b=sc.nextLine();
        BigInteger x= new BigInteger(a);
        BigInteger y=new BigInteger(b);
        BigInteger sum;
        sum=x.add(y);
        System.out.println("Your result is:" +sum);

    }
}
