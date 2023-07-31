import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String result = GetData.getData();
        String[] resultList = Parsing.parsing(result);
        boolean checkResult = Check.checkType(resultList);
        if (checkResult) {
            WriteData.writeData(resultList);
        } else {
            System.out.println("Recording not completed");
        }
    }
}