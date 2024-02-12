package Step353;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    String[] negativ = {":(", "=(", ":|"};


    @Override
    protected String[] getTooMuchKeywords() {
        return negativ;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}

