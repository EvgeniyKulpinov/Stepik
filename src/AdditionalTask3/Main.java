package AdditionalTask3;

import java.io.*;
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
            InputStream input = Files.newInputStream(Paths.get(PATH_TO_PROGRAM));
            OutputStream output = Files.newOutputStream(Paths.get(path + "\\joke.java"));
            int byteData;
            while ((byteData = input.read()) > 0) {
                output.write(byteData);
            }
            input.close();
            output.close();
        }
    }
}