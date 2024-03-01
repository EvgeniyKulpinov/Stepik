package AdditionalTask5V2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static final String PATH_TO_DATA = "C:\\AdT\\AdditTask5\\data.csv";
    public static final int MAX_CONSUMPTION = 300;


    public static void main(String[] args) throws Exception {
        Path path = Paths.get(PATH_TO_DATA);
        ReadingData data = new ReadingDataFile(path);
        ArrayList<User> arrayList = data.processReadingData();
        new Analyzer(arrayList, MAX_CONSUMPTION).analysis();
        new DataRecordingFile(path).dataRecording(arrayList);
    }
}