public class Parsing {

    public static String[] parsing(String data) {
        String[] result = data.split(" ");
        for (int i = 0; i < result.length; i++) {
            result[i] = result[i].trim();
        }
        return result;
    }
}