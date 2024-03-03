package AdditionalTask6;

public class Screwdriver extends Tool {
    public Screwdriver(Tool tool) {
        this.tool = tool;
    }
    public Screwdriver() {
    }
    @Override
    public void hardWork() {
        System.out.println("Uic Uic Uic");

    }
}
