package AdditionalTask6;

public class Clawhammer extends Tool {
    public Clawhammer(Tool tool) {
        this.tool = tool;
    }

    public Clawhammer() {
    }

    @Override
    public void hardWork() {
        System.out.println("Uihhhzzzz");

    }
}
