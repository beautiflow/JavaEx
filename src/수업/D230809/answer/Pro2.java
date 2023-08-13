package 수업.D230809.answer;

public class Pro2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        int s = 0; // 값이 같고 위치도 같은 경우
        int b = 0; // 값이 같고 위치가 다른 경우

        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 2; j++){
                if(arr[i] == arr2[j]){
                    if(i == j){
                        s++;
                    }
                    else {
                        b++;
                    }
                }
            }
        }

//        if(arr[0]==arr2[0])s++;
//        if(arr[0]==arr2[1])b++;
//        if(arr[0]==arr2[2])b++;
//        if(arr[1]==arr2[0])b++;
//        if(arr[1]==arr2[1])s++;
//        if(arr[1]==arr2[2])b++;
//        if(arr[2]==arr2[0])b++;
//        if(arr[2]==arr2[1])b++;
//        if(arr[2]==arr2[2])s++;


        System.out.printf("%dS%dB%n", s, b);



    }
}
