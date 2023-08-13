package 수업.D230809;

public class Ex4_8 {
    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++){
            for(int j = 0; j<= 10; j++){
                if((2*i)+(4*j)==10){
                    System.out.printf("x=%d, y=%d", i, j);
                    System.out.println();
                }
            }
        }
    }
}
