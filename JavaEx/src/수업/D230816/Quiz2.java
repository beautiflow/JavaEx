package 수업.D230816;

import java.util.Scanner;

public class Quiz2 {
    //tstatic int[][] bingo = new int[5][5];

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //    int[][] bingo = new int[5][5];
        int[][] bingo = {

                {1,1,1,1,1},

                {1,1,1,1,1},

                {1,1,1,1,1},

                {1,1,1,1,1},

                {1,1,1,1,1}
        };


        int total = bingoCount(bingo);
        System.out.println(total);
    }

    public static int bingoCount(int[][] bingo) {
        int total = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < bingo.length; i++) {
            int row = 0;
            int col = 0;

            for (int j = 0; j < bingo.length; j++) {
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
            }
            if (bingo[i][4-i] == 1) {
                right++;
                if (right == 5) {
                    total++;
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
