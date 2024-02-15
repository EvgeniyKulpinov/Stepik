package Step352;

public class AsciiCharSequence implements CharSequence {
    byte[] byteArray;

    public AsciiCharSequence(byte[] byteArray) {
        this.byteArray = byteArray;
    }

    @Override
    public int length() {
        return byteArray.length;
    }

    @Override
    public char charAt(int index) {
        return (char) byteArray[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] subSequence = new byte[end - start];
        int i = 0;
        while (start != end) {
            subSequence[i] = byteArray[start];
            start++;
            i++;
        }
        return new AsciiCharSequence(subSequence);
    }

    @Override
    public String toString() {
        return new String(byteArray);
    }

    public CharSequence subSequence(int start) {
        byte[] subSequence = new byte[byteArray.length - start + 1];
        int i = 0;
        while (start - 1 != byteArray.length) {
            subSequence[i] = byteArray[start - 1];
            start++;
            i++;
        }
        return new AsciiCharSequence(subSequence);
    }

    public CharSequence delete(int from, int to) {
        byte[] delete = new byte[byteArray.length - (to - from + 1)];
        int i = 0;
        while (i < from) {
            delete[i] = byteArray[i];
            i++;
        }
        i = i + (to - from);
        while (i < byteArray.length) {
            delete[i - (to - from + 1)] = byteArray[i];
            i++;
        }
        return new AsciiCharSequence(delete);
    }
}