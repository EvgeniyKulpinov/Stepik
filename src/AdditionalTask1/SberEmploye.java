package AdditionalTask1;

class SberEmploye extends Employe {
    private final double bankCoefficient;
    private final double ratingCoefficient;

    public SberEmploye(int[] profits, double bankCoefficient, double ratingCoefficient) {
        super(profits);
        this.bankCoefficient = bankCoefficient;
        this.ratingCoefficient = ratingCoefficient;
    }

    public int getBonus() {
        return (int) (super.getBonus() * bankCoefficient * ratingCoefficient);
    }
}
