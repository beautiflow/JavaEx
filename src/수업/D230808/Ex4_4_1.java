package 수업.D230808;

public class Ex4_4_1 {
    public static void main(String[] args) {

        int sum = 0;
        int sum2= 0;
        int result = 0;
        int count = 0;
        int i = 1;


        while (result <= 100){

            if (i % 2 == 1) {
                sum += i;
            } else if (i % 2 == 0) {
                sum2 += i;
            }
            count++;
            result++;
            i++;

            result = sum - sum2;

            if(result > 100){
                break;
            }

            System.out.println("sum = "+ sum);
            System.out.println("sum2 = " + sum2);
            System.out.println("result = " +result);
            System.out.println(i);
        }


        }
    }

