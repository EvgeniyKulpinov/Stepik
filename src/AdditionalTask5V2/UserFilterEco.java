package AdditionalTask5V2;

import java.util.ArrayList;

public class UserFilterEco extends UserFilter {
    public UserFilterEco(int maxConsumption) {
        super(maxConsumption);
    }

    @Override
    public ArrayList<User> filter(ArrayList<User> users) {
        ArrayList<User> users1 = new ArrayList<>();
        for (User user : users) {
            int[] consumptions = {
                    user.getWaterCountDay() + user.getWaterCountNight(),
                    user.getGasCount(),
                    user.getElectroCountDay() + user.getElectroCountNight()
            };
            for (int consumption : consumptions) {
                if (consumption > maxConsumption) {
                    break;
                }
                users1.add(user);
            }
        }
        return users1;
    }
}
