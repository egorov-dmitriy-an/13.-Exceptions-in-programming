import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Check {

    public static boolean checkType(String[] data) {
        if (data.length < 6) {
            throw new RuntimeException("You have entered little data");
        } else if (data.length > 6) {
            throw new RuntimeException("You have entered a lot of data");
        } else if (!checkBirthday(data[3])) return false;
        else if (!checkTel(data[4])) return false;
        else if (!checkGen(data[5])) return false;
        else return true;
    }

    private static boolean checkBirthday(String startDateString) {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        try {
            df.parse(startDateString);
            return true;
        } catch (ParseException e) {
            System.out.println("The birthday is entered incorrectly " + e.getMessage());
            return false;
        }
    }

    private static boolean checkTel(String number) {
        try {
            Long.parseLong(number);
            return true;
        } catch (Exception e) {
            System.out.println("Phone number entered incorrectly " + e.getMessage());
            return false;
        }
    }

    private static boolean checkGen(String gen) {
        if (!gen.equals("f") & !gen.equals("m")) {
            throw new RuntimeException("The gender entered incorrectly");
        } else return true;
    }
}