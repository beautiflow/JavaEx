package 수업.D230804;

public class Star3 {
    public static void main(String[] args) {
        String[][] arr = new String[6][6];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i+j == 4) {
                    arr[j][i] = "*";
                }
                else {
                    arr[j][i] = " ";
                }
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}
