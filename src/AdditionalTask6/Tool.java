package AdditionalTask6;

public abstract class Tool implements Workable {

    public Tool tool;

    public Tool() {
    }

    public Tool(Tool tool) {
        this.tool = tool;
    }

    public void work() {
        hardWork();
        if (tool != null){
            tool.work();
        }
    }
}
