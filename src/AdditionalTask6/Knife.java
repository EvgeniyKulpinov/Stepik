package AdditionalTask6;

public class Knife extends Tool {

    public Knife(Tool tool) {
        this.tool = tool;
    }

    public Knife() {
    }

    @Override
    public void hardWork() {
        System.out.println("Hsssch Hsssch");
    }
}
