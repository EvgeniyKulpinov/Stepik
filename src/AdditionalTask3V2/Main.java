package AdditionalTask3V2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static final String PATH_TO_PROGRAM =
            "C:\\Users\\User\\IdeaProjects\\AdditionalTask\\src\\AdditionalTask3\\HelloWorld.java";
    public static final String PATH_TO_DIRECROTY = "C:\\AdT\\AdditTask3";

    public static void main(String[] args) throws IOException {
        Path directory = Paths.get(PATH_TO_DIRECROTY);
        recursiveTraversal(directory);
    }

    public static void recursiveTraversal(Path directory) throws IOException {
        try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(directory)) {
            for (Path path : dirStream) {
                writingFile(path);
                recursiveTraversal(path);
            }
        } catch (java.nio.file.NotDirectoryException ignored) {
        }
    }

    public static void writingFile(Path path) throws IOException {
        if (Files.isDirectory(path)) {
            Path helloWorld = Paths.get(PATH_TO_PROGRAM);
            Files.copy(helloWorld, Path.of((path + "\\joke.java")));
        }
    }
}