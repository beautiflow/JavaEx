package 수업.D230804;

public class Star4 {
    public static void main(String[] args) {
        String[][] arr = new String[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i+j == 4 || i ==j){
                    arr[i][j] = "*";
                }
                else {
                    arr[i][j] = " ";
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
