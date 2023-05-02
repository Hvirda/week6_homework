public class TwentyPr {
    /*
    20. Write a Java Program using below steps.
 20.1 Declare your Spain as static variable.
 20.2 Declare your United Kingdom as instance variable.
 20.3 Declare instance method name homeCountry()and call static variable.
 20.4 Declare static method name holidays() and call instance variable
 20.5 Call both methods in main method.
     */
    static String s="Spain";
    String u="Uk";
    public void homeCountry(){
        System.out.println(s);
    }
    public static void holidays(){
        TwentyPr tr=new TwentyPr();
        System.out.println(tr.u);
    }

    public static void main(String[] args) {
        TwentyPr tr=new TwentyPr();
        tr.homeCountry();
        holidays();
    }

}
