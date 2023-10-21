package 수업.D230817;

public class Ex6_23 {
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{}));
    }

    public static int max(int[] arr){
        if(arr == null || arr.length == 0){
            return -999999;
        }
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[i] <= arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr[0];
    }
}
