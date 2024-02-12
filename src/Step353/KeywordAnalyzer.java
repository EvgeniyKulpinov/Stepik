package Step353;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getTooMuchKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        int i = 0;
        while (i < getTooMuchKeywords().length) {
            if (text.contains(getTooMuchKeywords()[i])) {
                return getLabel();
            }
            i++;
        }
        return Label.OK;
    }
}
