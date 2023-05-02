public class First_Pr {
      /*1. Write a Java programme using the following steps.
            1.1 Declare two instance variables.
            1.2 Declare one instance method.
            1.3 Call both instance variables into the instance method inside the print statement.
            1.4 Declare the Main method.
            1.5 Call the above instance method into the Main method and run the programme.
        */

    int a,b; //instance variable
    public void show() //call instance variable in method
    {
        System.out.println("Value of a and b is: "+a+" "+b);
    }
    public static void main(String[] args) {
        First_Pr fr=new First_Pr(); //create object to call instance variable and method
        fr.a=11;
        fr.b=22;
        fr.show();
    }

}
