package AdditionalTask3V2;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static final String PATH_TO_PROGRAM =
            "C:\\Users\\User\\IdeaProjects\\AdditionalTask\\src\\AdditionalTask3\\HelloWorld.java";
    public static final String PATH_TO_DIRECROTY = "C:\\AdT\\AdditTask3";

    public static void main(String[] args) throws IOException {
        Path directory = Paths.get(PATH_TO_DIRECROTY);
        Files.walkFileTree(directory,new MyFileVisitor(PATH_TO_PROGRAM));
    }
}