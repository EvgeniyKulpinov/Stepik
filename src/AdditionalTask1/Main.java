package AdditionalTask1;

import java.util.Arrays;

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
            System.out.println(worker);
        }
    }
}
