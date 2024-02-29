package AdditionalTask5V2;

public class Analyzer {
    public static final int MAX_CONSUMPTION = 300;
    User user;

    public Analyzer(User user) {
        this.user = user;
    }

    public Label analyzer() {
        int[] consumptions = {
                user.getWaterCountDay() + user.getWaterCountNight(),
                user.getGasCount(),
                user.getElectroCountDay() + user.getElectroCountNight()
        };
        for (int consumption : consumptions) {
            if (consumption > MAX_CONSUMPTION) {
                return Label.NOT_ECO_USER;
            }
        }
        return Label.ECO_USER;
    }
}
