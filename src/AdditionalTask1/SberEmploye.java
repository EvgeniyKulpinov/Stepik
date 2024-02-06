package AdditionalTask1;

class SberEmploye extends Employe {

    public SberEmploye(int[] profits, double bankCoefficient, double ratingCoefficient) {
        super(profits);
        this.bankCoefficient = bankCoefficient;
        this.ratingCoefficient = ratingCoefficient;
    }

    private final double bankCoefficient;
    private final double ratingCoefficient;

    public int getBonus() {
        int averageSalary = 0;
        for (int profit : getProfits()) {
            averageSalary = averageSalary + profit;
        }
        averageSalary = averageSalary / getProfits().length;
        return (int) (averageSalary * bankCoefficient * ratingCoefficient);
    }
}
