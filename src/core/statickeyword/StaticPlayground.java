package core.statickeyword;

public class StaticPlayground {
    public static void show() {
        System.out.println("showing static");
    }
    public static void main(String[] args) {
        StaticPlayground ob = new StaticPlayground();
        ob.show();
        ob = null;
        ob.show();
    }
}
