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

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Зарплата: ");
        for (int profit : profits) {
            builder.append(profit).append(" ");
        }
        builder.append("\nБонус: ");
        builder.append(getBonus());
        return builder.toString();
    }
}

