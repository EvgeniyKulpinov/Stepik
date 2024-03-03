package AdditionalTask6;

public class Main {
    public static void main(String[] args){
        Tool multitool = new Knife(new Screwdriver(new Clawhammer()));
        multitool.work();
        new RandomTool().generate().work();
    }
}
