package 수업.D230809.answer;

public class Pro3 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 5, 1, 1, 4, 5};
        int[] cntArr = new int[10];

        for(int i = 0; i < arr.length; i++){
            cntArr[arr[i]]++;
        }

        for(int i = 0; i < cntArr.length; i++){
            System.out.printf("cntArr[%d]=%d%n", i, cntArr[i]);
        }

        // 1. 중복제거


    }
}
