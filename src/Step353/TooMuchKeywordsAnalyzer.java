package Step353;

public class TooMuchKeywordsAnalyzer extends KeywordAnalyzer {
    private final String[] tooMuchKeywords;
    private final int maxRepetitions;

    public TooMuchKeywordsAnalyzer(String[] keywords, int maxRepetitions) {
        this.tooMuchKeywords = keywords;
        this.maxRepetitions = maxRepetitions;
    }

    @Override
    protected String[] getTooMuchKeywords() {
        return tooMuchKeywords;
    }

    @Override
    protected Label getLabel() {
        return Label.TOO_MUCH_KEYWORDS;
    }

    @Override
    public Label processText(String text) {
        String[] words = text.split(" ");
        int i = 0;
        int counter = 0;
        while (i < getTooMuchKeywords().length) {
            for (String word : words) {
                if (word.contains(getTooMuchKeywords()[i])) {
                    counter++;
                }
            }
            if (counter >= maxRepetitions) {
                return getLabel();
            }
            i++;
        }
        return Label.OK;
    }
}
