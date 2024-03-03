package AdditionalTask6;

public class RandomTool {
    Tool[] tools = {new Knife(), new Screwdriver(), new Clawhammer()};
    int i1 = (int) (Math.random() * tools.length);
    int i2 = (int) (Math.random() * tools.length);
    int i3 = (int) (Math.random() * tools.length);

    public Tool generate() {
        while (i1 == i2 || i2 == i3 || i1 == i3) {
            i2 = (int) (Math.random() * tools.length);
            i3 = (int) (Math.random() * tools.length);
        }
        Tool randomTool = tools[i1];
        tools[i1].setTool(tools[i2]);
        tools[i2].setTool(tools[i3]);
        return randomTool;
    }
}
