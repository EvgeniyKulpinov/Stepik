package AdditionalTask4;

import java.io.Serializable;

public class Human implements Serializable {
    String name;
    String passportNumber;

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }


    public Human(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }
}