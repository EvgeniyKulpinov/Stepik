package AdditionalTask6;

public class RandomTool {

    Tool[] tools = {
            new Knife(new Screwdriver(new Clawhammer())),
            new Knife(new Clawhammer(new Screwdriver())),
            new Screwdriver(new Knife(new Clawhammer())),
            new Screwdriver(new Clawhammer(new Knife())),
            new Clawhammer(new Screwdriver(new Knife())),
            new Clawhammer(new Knife(new Screwdriver()))
    };

    public Tool generate() {
        return tools[(int) (Math.random() * 6)];
    }
}
