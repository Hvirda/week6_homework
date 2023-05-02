public class NighteenPr {
    /*

    19. Write a Java Program using below steps.
 19.1 Declare one of your group member names as instance variable.
 19.2 Declare one of your group member names as static variable.
 19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
 19.4 Declare static method name agile() and call both variable
 19.5 Call both user defined methods into main method.
     */
    String s="Situben";
    static String v="Vidhi";
    public void selenium(){
        int a=1;
        System.out.println(a);
        System.out.println(s);
        System.out.println(v);
    }
    public static void agile(){
        int b=2;
        System.out.println(b);
        NighteenPr er=new NighteenPr();
        System.out.println(er.s);
        System.out.println(v);
    }

    public static void main(String[] args) {
        int c=3;
        System.out.println(c);
        NighteenPr nr=new NighteenPr();
        nr.selenium();
        agile();

    }
}
