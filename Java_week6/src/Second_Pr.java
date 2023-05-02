public class Second_Pr {

      /*  2. Write a Java programme using the following steps.
            2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
            2.5 Call the static method into the Main method and run the programme.
*/
    static int x=10,y=20; //static variables
    public static void print1() // static method
    {
        System.out.println("static variable values are: "+x+" "+y);
    }

    public static void main(String[] args) {
        print1(); //call static method
    }
}
