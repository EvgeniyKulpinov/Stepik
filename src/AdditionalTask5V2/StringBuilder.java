package AdditionalTask5V2;

public class StringBuilder {
    User user;

    public StringBuilder(User user) {
        this.user = user;
    }
    public String builder(){
        return user.getId() + "|" +
                user.getName() + "|" +
                user.getWaterCountDay() + "|" +
                user.getWaterCountNight() + "|" +
                user.getGasCount() + "|" +
                user.getElectroCountDay() + "|" +
                user.getElectroCountNight();
    }


}
