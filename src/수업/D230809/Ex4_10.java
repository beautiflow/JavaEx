package 수업.D230809;

public class Ex4_10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while(num>0){
            sum += num%10;
            num = num/10;
            if(num<=0){
                break;
            }
        }
        System.out.println(sum);
    }
}
