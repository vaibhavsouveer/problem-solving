package core.clone;

public class ClonePlayground implements Cloneable{
    int x = 10;

    public static void main(String[] args) {
        ClonePlayground ob = new ClonePlayground();
        try {
            ob.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
