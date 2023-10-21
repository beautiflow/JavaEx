package TIL.D230815.Ex6_7;

public class Ex6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2, 2));

    }
}

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) {
        int xd = (int) Math.pow((this.x - x1), 2);
        int yd = (int) Math.pow((this.y - y1), 2);

        double distan = Math.sqrt(xd + yd);
        return distan;

    }
}
