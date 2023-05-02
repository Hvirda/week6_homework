import java.util.Scanner; //import package

public class EightPr {
    /*
    8. Write a program to insert any temperature value in degree Fahrenheit and convert to
degree Celsius ((F − 32) × 5/9 = 0°C).

     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // create object of scanner class
        System.out.println("Enter Fahrenheit");
        double f=sc.nextInt();         //take user input
        double c = ((f - 32) * 5 / 9);
        System.out.println(c);
    }

}
