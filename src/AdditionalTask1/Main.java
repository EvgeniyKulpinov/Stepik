package AdditionalTask1;

public class Main {
    public static void main(String[] args) {
        double bankCoefficient = 1.3;
        double ratingCoefficient = 1.5;
        boolean bonusCondition = true;
        int[] zp = {100000, 200000, 120000, 140000, 150000, 100000, 200000, 120000, 140000, 150000, 170000, 180000};
        Employe[] workers = {
                new EpamEmploye(zp),
                new SberEmploye(zp, bankCoefficient, ratingCoefficient),
                new QIWIEmploye(zp, bonusCondition),
        };
        for (Employe worker : workers) {
            informationTheEmployee(worker);
        }
    }

    public static void informationTheEmployee(Employe worker) {
        System.out.println("Зарплата: " + worker.toString());
        System.out.println("Бонус: " + worker.getBonus());
    }
}
