package stringPr;

public class Third {
    /*
    3. Write a java program which replace a “I love java” to “we love java”
Expected output: We love java
     */
    public static void main(String[] args) {
        String s="I love java";
        System.out.println(s.replaceAll("I", "We"));
    }
}
