package 수업.D230809.answer;

public class Pro1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int cnt = 0;

        boolean eq = true;
        for(int i = 0; i <= 2; i++){
            if(arr[i]!=arr2[i]){
                eq =false;
                break;
            }
        }

        // arr과 arr2 가 같은지 비교
        // 모든 요소의 값이 같은가
//        if(arr[0]==arr2[0]) cnt++;
//        if(arr[1]==arr2[1]) cnt++;
//        if(arr[2]==arr2[2]) cnt++;

        for(int i = 0; i <= 2; i++){
            if(arr[i]==arr2[i]) cnt++;
        }

        if(cnt == 3){
            System.out.println("같슈");
        }
        else {
            System.out.println("달라유");
        }
    }
}
