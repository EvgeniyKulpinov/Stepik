package AdditionalTask5V2;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataRecordingFile extends DataRecording {
    public DataRecordingFile(Path path) {
        super(path);
    }

    @Override
    OutputStream output() throws IOException {
        return Files.newOutputStream(Paths.get(path + "\\..\\ecoUser.csv"));
    }

    @Override
    Label getLable() {
        return Label.ECO_USER;
    }
}
