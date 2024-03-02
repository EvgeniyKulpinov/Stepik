package AdditionalTask5V2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class UserReaderFile extends UserReader {

    public UserReaderFile(Path path) {
        super(path);
    }

    @Override
    InputStream input() throws IOException {
        return Files.newInputStream(path);
    }
}
