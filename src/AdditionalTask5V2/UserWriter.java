package AdditionalTask5V2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.ArrayList;

public abstract class UserWriter {
    public static final byte LINE_FEED = 10;
    Path path;

    public UserWriter(Path path) {
        this.path = path;
    }

    abstract OutputStream output() throws IOException;

    public void write(ArrayList<User> users) throws IOException {
        OutputStream output = output();
        for (User user : users) {
            String string = dataBuilder(user);
            InputStream input = new ByteArrayInputStream(string.getBytes());
            int byteData;
            while ((byteData = input.read()) > 0) {
                output.write(byteData);
            }
            output.write(LINE_FEED);
        }
        output.close();
    }

    private String dataBuilder(User user) {
        return user.getId() + "|" +
                user.getName() + "|" +
                user.getWaterCountDay() + "|" +
                user.getWaterCountNight() + "|" +
                user.getGasCount() + "|" +
                user.getElectroCountDay() + "|" +
                user.getElectroCountNight();
    }
}

