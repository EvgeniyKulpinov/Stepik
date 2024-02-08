package AdditionalTask2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ComplexNumber[] array = new ComplexNumber[300000];
        for (int i = 0; i < array.length; i++) {
            array[i] = new ComplexNumber(new Random().nextDouble(), new Random().nextDouble());
        }
        int counter = 0;
        for (ComplexNumber arr : array) {
            for (ComplexNumber arr1 : array) {
                if (arr.hashCode1() == arr1.hashCode1()) {
                    counter++;
                }
            }
        }
        System.out.println(counter - array.length);
        int counter2 = 0;
        for (ComplexNumber arr : array) {
            for (ComplexNumber arr1 : array) {
                if (arr.hashCode2() == arr1.hashCode2()) {
                    counter2++;
                }
            }
        }
        System.out.println(counter2 - array.length);
    }
}