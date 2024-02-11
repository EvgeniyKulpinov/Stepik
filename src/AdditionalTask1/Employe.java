package AdditionalTask1;

public class Employe {
    private final int[] profits;

    public Employe(int[] profits) {
        this.profits = profits;
    }

    public int getBonus() {
        int bonus = 0;
        for (int profit : getProfits()) {
            bonus = bonus + profit;
        }
        bonus = bonus / getProfits().length;
        return bonus;
    }

    public int[] getProfits() {
        return profits;
    }
}

