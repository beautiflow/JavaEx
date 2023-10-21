package 수업.D230807;
// 1차원 배열 arr의 값들을 2차원 배열 4행3열 arr2에 복사하여 출력하시오.

public class Quiz5 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[][] arr2 = new int[4][3];

        int count = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                arr2[i][j] = arr[count++];
                System.out.printf("%3d", arr2[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        int count2 = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                arr[count2++] = arr2[i][j];
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
