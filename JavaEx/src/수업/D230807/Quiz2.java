package 수업.D230807;

public class Quiz2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr2[i]){
                count++;
            }
            else {
                System.out.println("다릅니다.");
                break;
            }
        }
        if(count==arr.length){
            System.out.println("같ㅅㅅㅅ습니다.");
        }

    }
}
