public class SeventeenPr {
    /*
    17. Write a Java Program using below steps.
    17.1 Declare your city as instance variables.
    17.2 Declare your country as static variables.
    17.3 Declare one instance method and call static variable in print statement
    17.4 Declare static method and call instance variable in print Statement.
    17.5 Call both user defined methods into main method.

     */
    String l="London";
    static String country="UK";
    public void call(){
        System.out.println("This is static variable: "+country);
    }
    public static void staticCall(){
        SeventeenPr sp=new SeventeenPr();
        System.out.println("This is Instance variable: "+sp.l);
    }

    public static void main(String[] args) {
        SeventeenPr sp=new SeventeenPr();
        staticCall();
        sp.call();
    }

}
