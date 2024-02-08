package AdditionalTask2;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public int hashCode1() {
        return (Double.hashCode(im) + Double.hashCode(re));
    }

    public int hashCode2() {
        return (Double.hashCode(im) * 29 + Double.hashCode(re) * 33);

    }
}