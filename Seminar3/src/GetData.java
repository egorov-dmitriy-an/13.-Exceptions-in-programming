import java.util.Scanner;

public class GetData {

    public static String getData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Last name, First name, Patronymic, Date of birth, Phone number, Gender: ");
        return scan.nextLine();
    }
}