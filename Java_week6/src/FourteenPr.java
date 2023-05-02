import java.util.Scanner;

public class FourteenPr {
    /*
    14. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=n1+n2;
        int sub=n1-n2;
        int multi=n1*n2;
        int div=n1/n2;
        int reminder=n1%n2;
        System.out.println("addition is: "+sum);
        System.out.println("subtraction is: "+sub);
        System.out.println("multiplication is: "+multi);
        System.out.println("division is: "+div);
        System.out.println("reminder is: "+reminder);
    }
}
