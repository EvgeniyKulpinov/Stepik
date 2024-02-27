package AdditionalTask5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static final String PATH_TO_DATA = "C:\\AdT\\AdditTask5\\data.csv";
    public static final int MAX_CONSUMPTION = 190;
    public static final byte LINE_FEED = 10;

    public static void main(String[] args) throws IOException {
        InputStream input = Files.newInputStream(Paths.get(PATH_TO_DATA));
        OutputStream output = Files.newOutputStream(Paths.get(PATH_TO_DATA + "\\..\\ecoUser.csv"));
        Scanner scanner = new Scanner(input);
        scanner.nextLine();
        ecoCheck(scanner, output);
    }

    public static void ecoCheck(Scanner scanner, OutputStream output) throws IOException {
        while (scanner.hasNext()) {
            boolean indicat = true;
            String string = scanner.nextLine();
            String[] strings = string.split("\\|");
            int indexFirstResource = 2;
            for (int i = indexFirstResource; i < strings.length; i++) {
                if (Integer.parseInt(strings[i]) >= MAX_CONSUMPTION) {
                    indicat = false;
                }
            }
            writingLine(indicat, string, output);
        }
        output.close();
    }

    public static void writingLine(boolean indicat, String string, OutputStream output) throws IOException {

        if (indicat) {
            InputStream input2 = new ByteArrayInputStream(string.getBytes());
            int byteData;
            while ((byteData = input2.read()) > 0) {
                output.write(byteData);
            }
            output.write(LINE_FEED);
        }
    }
}
