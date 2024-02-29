package AdditionalTask5V2;

public class UserBuilder {
    private final String string;
    private final User user;

    public UserBuilder(String string, User user) {
        this.string = string;
        this.user = user;
    }
    public User builder(){
        String[] strings = string.split("\\|");
        user.setId(Integer.parseInt(strings[0]));
        user.setName(strings[1]);
        user.setWaterCountDay(Integer.parseInt(strings[2]));
        user.setWaterCountNight(Integer.parseInt(strings[3]));
        user.setGasCount(Integer.parseInt(strings[4]));
        user.setElectroCountDay(Integer.parseInt(strings[5]));
        user.setElectroCountNight(Integer.parseInt(strings[6]));
        return user;
    }
}
