package TIL.D230815.Ex6_6;

public class Ex6_6 {
    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }

    static double getDistance(int x1, int y1, int x2, int y2){
        int xd = (int) Math.pow((x2-x1), 2);
        int yd = (int) Math.pow((y2-y1), 2);

        double distan = Math.sqrt(xd+yd);
        return distan;

    }
}


