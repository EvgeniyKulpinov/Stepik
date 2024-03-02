package AdditionalTask5V2;

import java.util.ArrayList;

public abstract class UserFilter {
    int maxConsumption;

    public UserFilter(int maxConsumption) {
        this.maxConsumption = maxConsumption;
    }

    public abstract ArrayList<User> filter(ArrayList<User> users);
}
