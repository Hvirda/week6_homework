public class Fourth_Pr {
    /*    4. Write a Java programme using the following steps.
 4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the
      print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.
      */

    int a=2,b=3;
    static int x=7,y=8;
    public void show(){
        System.out.println("value of a is: "+a);
        System.out.println("value of b is: "+b);
        System.out.println("value of x is: "+x);
        System.out.println("value of y is: "+y);
    }

    public static void print1(){
       Fourth_Pr fr1=new Fourth_Pr();
        System.out.println("value of a is: "+fr1.a);
        System.out.println("value of b is: "+fr1.b);
        System.out.println("value of x is: "+x);
        System.out.println("value of y is: "+y);

    }

    public static void main(String[] args) {
        Fourth_Pr fr1=new Fourth_Pr();
        fr1.show();
        print1();
    }
}
