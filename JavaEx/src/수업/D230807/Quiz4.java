package 수업.D230807;

public class Quiz4 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 4, 1, 7, 3, 2, 5, 1, 3};
        int[] counter = new int[11];

        // 1. 중복 제거
        for(int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }
        for(int i = 0; i < arr.length; i++){
            if(counter[i] > 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 2. 정렬
        for(int i = 0; i < arr.length; i++){
                int check = counter[i];
                while ( check > 0 ){
                    System.out.print(i+" ");
                    check--;
            }
        }
    }
}
