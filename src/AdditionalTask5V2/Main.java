package AdditionalTask5V2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static final String PATH_TO_DATA = "C:\\AdT\\AdditTask5\\data.csv";
    public static final int MAX_CONSUMPTION = 300;

    public static void main(String[] args) throws Exception {
        Path path = Paths.get(PATH_TO_DATA);

        UserReader reader = new UserReaderFile(path);
        UserFilter filter = new UserFilterEco(MAX_CONSUMPTION);
        UserWriter writer = new UserWriterFile(path);

        ArrayList<User> inputData = reader.read();
        ArrayList<User> ecoUser = filter.filter(inputData);
        writer.write(ecoUser);
    }
}