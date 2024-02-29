package AdditionalTask5V2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final String PATH_TO_DATA = "C:\\AdT\\AdditTask5\\data.csv";
    public static final byte LINE_FEED = 10;

    public static void main(String[] args) throws Exception {
        InputStream input = Files.newInputStream(Paths.get(PATH_TO_DATA));
        OutputStream output = Files.newOutputStream(Paths.get(PATH_TO_DATA + "\\..\\ecoUser.csv"));
        writingLine(output, userRegistration(new Scanner(input)));
    }

    public static void writingLine(OutputStream output, ArrayList<User> users) throws IOException {
        for (User user : users){
            if (Label.ECO_USER == (new Analyzer(user).analyzer())){
                String string = new StringBuilder(user).builder();
                InputStream input2 = new ByteArrayInputStream(string.getBytes());
                int byteData;
                while ((byteData = input2.read()) > 0) {
                    output.write(byteData);
                }
                output.write(LINE_FEED);
            }
        }
        output.close();
    }

    public static ArrayList<User> userRegistration(Scanner scanner) {
        scanner.nextLine();
        ArrayList<User> users = new ArrayList<>();
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            users.add(new UserBuilder(string, new User()).builder());
        }
        return users;
    }
}