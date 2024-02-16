package Step352;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] array = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence result = new AsciiCharSequence(array);
        System.out.println("Последовательность - " + result);//Hello!
        System.out.println("Размер её - " + result.length());//6
        System.out.println("Символ под № 1 - " + result.charAt(1));//e
        System.out.println("Подпоследовательность - " + result.subSequence(1, 5));//ello
        System.out.println("Подпоследовательность2 - " + result.subSequence(3));//llo!
        System.out.println("Удаление - " + result.delete(2,5));
    }
}
