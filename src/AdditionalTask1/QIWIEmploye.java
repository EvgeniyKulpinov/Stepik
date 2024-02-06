package AdditionalTask1;

class QIWIEmploye extends Employe {
    boolean bonusCondition;

    public QIWIEmploye(int[] profits, boolean bonusCondition) {
        super(profits);
        this.bonusCondition = bonusCondition;
    }

    public int getBonus() {
        int averageSalary = 0;
        for (int profit : getProfits()) {
            averageSalary = averageSalary + profit;
        }
        averageSalary = averageSalary / getProfits().length;
        if (bonusCondition) {
            return averageSalary * 8;
        } else {
            return 0;
        }
    }
}