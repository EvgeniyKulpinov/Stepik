package AdditionalTask5V2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingDataFile extends ReadingData {

    public ReadingDataFile(Path path) {
        super(path);
    }

    @Override
    InputStream input() throws IOException {
        return Files.newInputStream(path);
    }
}
