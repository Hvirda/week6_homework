public class Third_Pr {
    /*
    3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
 3.6 Call both instance and static methods into the Main method and run the programme.
     */

    int h=10;
    static int j=20;
    public void show(){
        System.out.println("Instance value is "+h);
        System.out.println("Static value is "+j);
    }
    public static void print1(){
        Third_Pr tp=new Third_Pr();
        System.out.println("Instance value is "+tp.h);
        System.out.println("Static value is "+j);
    }

    public static void main(String[] args) {
        Third_Pr tp=new Third_Pr();
        tp.show();
        print1();
    }

}
