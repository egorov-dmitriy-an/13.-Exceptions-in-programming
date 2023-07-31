import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

    public static void writeData(String[] data) throws IOException {
        String nameFile = data[0] + ".txt";

        try (FileWriter writer = new FileWriter(nameFile, true)) {
            for (int i = 0; i <= data.length; i++) {
                if (i < data.length) {
                    writer.write("<" + data[i] + ">");
                } else {
                    writer.write("\n");
                }
            }
            System.out.println("Recording completed");
        }
    }
}
