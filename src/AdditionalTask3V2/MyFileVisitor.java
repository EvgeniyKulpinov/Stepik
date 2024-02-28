package AdditionalTask3V2;


import java.io.IOException;
import java.nio.file.*;

public class MyFileVisitor extends SimpleFileVisitor<Path> {

    String PathToProgram;

    public MyFileVisitor(String pathToProgram) {
        PathToProgram = pathToProgram;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        try {
            Path helloWorld = Paths.get(this.PathToProgram);
            Files.copy(helloWorld, Path.of((dir + "\\joke.java")));
        }catch (java.nio.file.FileAlreadyExistsException ignored){
        }
        return FileVisitResult.CONTINUE;
    }
}