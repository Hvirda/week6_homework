public class FifthPr {
    /*
    5. Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.)
     */
    public void addition(int a,int b){
         System.out.println("Addition of a and b is: "+(a+b));
    }
    public void subtraction(int x,int y){
          System.out.println("Subtraction of x and y is: "+(x-y));
    }
    public static void multiplication(int a,int b){

        System.out.println("Subtraction of a and b is: "+(a-b));
    }
    public static void division(int x,int y){
        System.out.println("Division of x and y is: "+(x/y));
    }

    public static void main(String[] args) {
        FifthPr fr=new FifthPr();
        fr.addition(20,30);
        fr.subtraction(40,20);
        multiplication(20,7);
        division(50,2);
    }
}
