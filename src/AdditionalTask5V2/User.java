package AdditionalTask5V2;

public class User {
    public int id;
    public String name;
    public int waterCountDay;
    public int waterCountNight;
    public int gasCount;
    public int electroCountDay;
    public int electroCountNight;

    public User() {
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWaterCountDay() {
        return waterCountDay;
    }

    public int getWaterCountNight() {
        return waterCountNight;
    }

    public int getGasCount() {
        return gasCount;
    }

    public int getElectroCountDay() {
        return electroCountDay;
    }

    public int getElectroCountNight() {
        return electroCountNight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWaterCountDay(int waterCountDay) {
        this.waterCountDay = waterCountDay;
    }

    public void setWaterCountNight(int waterCountNight) {
        this.waterCountNight = waterCountNight;
    }

    public void setGasCount(int gasCount) {
        this.gasCount = gasCount;
    }

    public void setElectroCountDay(int electroCountDay) {
        this.electroCountDay = electroCountDay;
    }

    public void setElectroCountNight(int electroCountNight) {
        this.electroCountNight = electroCountNight;
    }
}
