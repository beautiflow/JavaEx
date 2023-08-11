package 수업.D230804;

public class Num8 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 5; i < j; j--) {
                System.out.print("      ");
            }
            for(int j = 5; j >= i; j++) {
                System.out.print("[" + i +", "+ j + "]");
            }
            for(int j = i + 4; j > 5; j--) {
                System.out.print("[" + i +", "+ j + "]");
            }
            System.out.println();
        }
    }
}
