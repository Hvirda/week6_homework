import java.util.Scanner;

public class TenthPr {
    /*
    10. Write a Java program that takes a number as input and prints its multiplication
table up to 10.
Test Data: Input a number: 8.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();

        int a=n*1,b=n*2,c=n*3,d=n*4,e=n*5,f=n*6,g=n*7,h=n*8,i=n*9,j=n*10;
        System.out.println(+n+" * 1= "+a);
        System.out.println(+n+" * 2= "+b);
        System.out.println(+n+" * 3= "+c);
        System.out.println(+n+" * 4= "+d);
        System.out.println(+n+" * 5= "+e);
        System.out.println(+n+" * 6= "+f);
        System.out.println(+n+" * 7= "+g);
        System.out.println(+n+" * 8= "+h);
        System.out.println(+n+" * 9= "+i);
        System.out.println(+n+" * 10= "+j);
    }
}
