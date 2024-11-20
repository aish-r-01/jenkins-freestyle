import java.util.*;
public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(5, 10));
        System.out.println("Multiplication: " + multiply(5, 10));
    }
}
