package 수업.D230807;

public class Quiz3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 3, 2};

        int S = 0;
        int B = 0;

        for(int i = 0; i < 3; i++){
            if(arr[i] == arr2[i]){
                S++;
            }
            else {
                for(int j = 0; j < 3; j++){
                    if(arr[i] == arr2[j]){
                        B++;
                    }
                }
            }

        }
        System.out.print(S+"S");
        System.out.println(B+"B");
    }
}
