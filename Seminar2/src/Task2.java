import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("input string:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str == null || str.isEmpty()) {
            try {
                throw new Exception ("String is null");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("You string: " + str);
        }
    }
}
