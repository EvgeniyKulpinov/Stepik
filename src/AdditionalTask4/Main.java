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
        human.setPassportNumber(coder(human.getPassportNumber()));
        Path path = Paths.get("human.bin");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            outputStream.writeObject(human);
            return path;
        }
    }

    public static Human deserializeHuman(Path path) throws Exception {
        try (ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(path))) {
            Human human = (Human) inputStream.readObject();
            human.setPassportNumber(decoder(human.getPassportNumber()));
            return human;
        }
    }

    public static String coder(String string) {
        StringBuilder builder = new StringBuilder();
        String[] strings = string.split("");
        for (int i = 0; i < strings.length - 1; ) {
            int number1 = Integer.parseInt(strings[i]);
            i++;
            int number2 = Integer.parseInt(strings[i]);
            builder.append((number1 + number2) % 10);
            if (i == strings.length - 1) {
                builder.append(number2);
            }
        }
        return builder.toString();
    }

    public static String decoder(String string) {
        StringBuilder builder = new StringBuilder();
        String[] strings = string.split("");
        int coefRemains = 10;
        int number1 = Integer.parseInt(strings[strings.length - 1]);
        builder.append(number1);
        for (int i = strings.length - 1; i > 0; i--) {
            int number2 = Integer.parseInt(strings[i - 1]);
            builder.append(((number2 + coefRemains) - number1) % coefRemains);
            number1 = ((number2 + coefRemains) - number1) % coefRemains;
        }
        return builder.reverse().toString();
    }
}
