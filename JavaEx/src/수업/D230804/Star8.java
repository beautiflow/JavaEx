package 수업.D230804;

public class Star8 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 4; i < j; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = i + 4; j > 4; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
