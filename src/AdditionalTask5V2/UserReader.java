package AdditionalTask5V2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class UserReader {
    Path path;

    public UserReader(Path path) {
        this.path = path;
    }

    abstract InputStream input() throws IOException;

    public ArrayList<User> read() throws IOException {
        Scanner scanner = new Scanner(input());
        scanner.nextLine();
        ArrayList<User> users = new ArrayList<>();
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            users.add(User.builder(string));
        }
        return users;
    }
}

