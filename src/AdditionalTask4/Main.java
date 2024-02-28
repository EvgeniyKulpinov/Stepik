package AdditionalTask4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        Human human1 = new Human("Пётр", "1789");
        Human desHuman = deserializeHuman(serializeHuman(human1));
        System.out.println(desHuman.getName());
        System.out.println(desHuman.getPassportNumber());
    }

    public static Path serializeHuman(Human human) throws IOException {
        Path path = Paths.get("human.bin");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            outputStream.writeObject(human);
            return path;
        }
    }

    public static Human deserializeHuman(Path path) throws Exception {
        try (ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(path))) {
            return (Human) inputStream.readObject();
        }
    }
}
