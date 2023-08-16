package 수업.D230816;

import java.util.Scanner;

public class Quiz2 {
   // static int[][] bingo = new int[5][5];

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[][] bingo = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = sc.nextInt();
            }
        }
        int total = bingoCount(bingo);
        System.out.println(total);
    }

    public static int bingoCount(int[][] bingo) {
       int total = 0;
        int left = 0;
        for (int i = 0; i < 5; i++) {
            int row = 0;
            int col = 0;
            int right = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == 1) {
                    row++;
                    if (row == 5) {
                        total++;
                    }
                }
                if (bingo[j][i] == 1) {
                    col++;
                    if (col == 5) {
                        total++;
                    }
                }
                if (bingo[i][4 - j] == 1) {
                    right++;
                    if (right == 5) {
                        total++;
                    }
                }
            }
            if (bingo[i][i] == 1) {
                left++;
                if(left == 5){
                    total++;
                }
            }
        }
        return total;
    }
}
