package AdditionalTask5V2;

import java.util.ArrayList;

public class Analyzer {
    int maxConsumption;
    ArrayList<User> users;

    public Analyzer(ArrayList<User> users, int maxConsumption) {
        this.users = users;
        this.maxConsumption = maxConsumption;
    }

    public void analysis() {
        for (User user : users) {
            int[] consumptions = {
                    user.getWaterCountDay() + user.getWaterCountNight(),
                    user.getGasCount(),
                    user.getElectroCountDay() + user.getElectroCountNight()
            };
            for (int consumption : consumptions) {
                if (consumption > maxConsumption) {
                    user.setLabel(Label.NOT_ECO_USER);
                    break;
                }
                user.setLabel(Label.ECO_USER);
            }
        }
    }
}
