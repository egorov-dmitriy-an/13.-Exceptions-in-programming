import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        out_float();
    }

    public static void out_float() {
        Scanner scan = new Scanner(System.in);
        System.out.println("input number");
        try {
            float number = scan.nextFloat();
            System.out.println("yor number: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Catching exception: " + e);
            System.out.println("Please enter number");
            out_float();
        }
    }
}