package TIL.D230821.Ex7_26;

public class Ex7_26 {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        System.out.println(in.iv);
    }
}

class Outer{
    static class Inner{
        int iv = 200;
    }
}

