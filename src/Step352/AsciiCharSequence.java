package Step352;

public class AsciiCharSequence implements CharSequence {
    byte[] byteArray;

    public byte[] getByteArray() {
        return byteArray;
    }

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
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] subSequence = new byte[end - start];
        for (int i = 0; start != end; i++, start++) {
            subSequence[i] = byteArray[start];
        }
        return new AsciiCharSequence(subSequence);
    }

    public AsciiCharSequence subSequence(int start) {
        return subSequence(start - 1, byteArray.length);
    }

    public AsciiCharSequence concat(AsciiCharSequence sequence) {
        byte[] result = new byte[this.length() + sequence.length()];
        for (int i = 0; i < result.length; ) {
            while (i < this.length()) {
                result[i] = this.getByteArray()[i];
                i++;
            }
            while (i < result.length) {
                result[i] = sequence.getByteArray()[i - this.length()];
                i++;
            }
        }
        return new AsciiCharSequence(result);
    }


    public AsciiCharSequence delete(int from, int to) {
        return subSequence(0, from - 1).concat(subSequence(to + 1));
    }

//    public AsciiCharSequence delete(int from, int to) throws IOException {
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        outputStream.write(subSequence(0, from - 1).getByteArray());
//        outputStream.write(subSequence(to + 1).getByteArray());
//        return new AsciiCharSequence(outputStream.toByteArray());
//    }

    //        public CharSequence delete(int from, int to) {
//        byte[] delete = new byte[byteArray.length - (to - from + 1)];
//        int i = 0;
//        while (i < from) {
//            delete[i] = byteArray[i];
//            i++;
//        }
//        i = i + (to - from);
//        while (i < byteArray.length) {
//            delete[i - (to - from + 1)] = byteArray[i];
//            i++;
//        }
//        return new AsciiCharSequence(delete);
//    }
    @Override
    public String toString() {
        return new String(byteArray);
    }
//    public AsciiCharSequence concat2(AsciiCharSequence sequence1, AsciiCharSequence sequence2) {
//        byte[] result = new byte[sequence1.length() + sequence2.length()];
//        for (int i = 0; i < result.length; ) {
//            while (i < sequence1.length()) {
//                result[i] = sequence1.getByteArray()[i];
//                i++;
//            }
//            while (i < result.length) {
//                result[i] = sequence2.getByteArray()[i - sequence1.length()];
//                i++;
//            }
//        }
//        return new AsciiCharSequence(result);
//    }
}
