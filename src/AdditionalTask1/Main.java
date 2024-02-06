package AdditionalTask1;

public class Main {
    public static void main(String[] args) {
        double bankCoefficient = 1.3;
        double ratingCoefficient = 1.5;
        boolean bonusCondition = true;
        int[] zp = {100000, 200000, 120000, 140000, 150000, 100000, 200000, 120000, 140000, 150000, 170000, 180000};
        EpamEmploye petya = new EpamEmploye(zp);
        SberEmploye vasya = new SberEmploye(zp, bankCoefficient, ratingCoefficient);
        QIWIEmploye igor = new QIWIEmploye(zp, bonusCondition);
        informationTheEmployee(igor);
        informationTheEmployee(vasya);
        informationTheEmployee(petya);
    }

    public static void informationTheEmployee(Employe worker) {
        StringBuilder builder = new StringBuilder();
        for (int profit : worker.getProfits()) {
            builder.append(profit).append(" ");
        }
        System.out.println("Зарплата: " + builder);
        System.out.println("Бонус: " + worker.getBonus());
    }
}
