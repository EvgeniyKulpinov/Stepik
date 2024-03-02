package AdditionalTask5V2;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UserWriterFile extends UserWriter {
    public UserWriterFile(Path path) {
        super(path);
    }

    @Override
    OutputStream output() throws IOException {
        return Files.newOutputStream(Paths.get(path + "\\..\\ecoUser.csv"));
    }
}
