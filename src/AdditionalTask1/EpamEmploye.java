package AdditionalTask1;

class EpamEmploye extends Employe {
    public EpamEmploye(int[] profits) {
        super(profits);
    }
    public int getBonus() {
        int averageSalary = 0;
        for (int profit : getProfits()) {
            averageSalary = averageSalary + profit;
        }
        averageSalary = averageSalary / getProfits().length;
        return averageSalary;
    }
}
