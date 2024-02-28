package AdditionalTask4;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Human implements Externalizable {
    private String name;
    private String passportNumber;

    public Human(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public Human() {
    }


    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.name);
        out.writeObject(this.coder(this.passportNumber));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        passportNumber = this.decoder((String) in.readObject());

    }
    private String coder(String string) {
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

    private String decoder(String string) {
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