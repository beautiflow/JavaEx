package 수업.D230804;

public class Num7 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print("[" + i +", "+ j + "]");
            }
            for(int j = 5; j < 5+i; j++) {
                System.out.print("[" + i +", "+ j + "]");
            }
            System.out.println();
        }
    }
}
