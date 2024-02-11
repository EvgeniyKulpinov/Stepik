package AdditionalTask1;

class QIWIEmploye extends Employe {
    boolean bonusCondition;

    public QIWIEmploye(int[] profits, boolean bonusCondition) {
        super(profits);
        this.bonusCondition = bonusCondition;
    }

    @Override
    public int getBonus() {
        if (bonusCondition) {
            return super.getBonus() * 8;
        } else {
            return 0;
        }
    }
}