package 수업.D230808;

public class Ex4_4_2 {
    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;

        for(int i = 1; i <= 201; i++){
            if(i%2 == 1){
                sum += i;
            }
            else if(i%2==0){
                sum2 += i;
            }
            System.out.println("sum = " + sum);
            System.out.println("sum2 = "+ sum2);
            System.out.println("result = "+ (sum-sum2));
        }

    }
}
