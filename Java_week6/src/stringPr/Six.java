package stringPr;

public class Six {
    /*
    Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java
     */
    public static void main(String[] args) {
        String s="I@love@java";
       String n= s.replace('@',' ');
        System.out.println(n.replaceAll("I", "We"));

    }
}
