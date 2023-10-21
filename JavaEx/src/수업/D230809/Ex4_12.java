package 수업.D230809;

public class Ex4_12 {
    public static void main(String[] args) {

        for(int i = 2; i < 10; i++){
            if(i%3==2){
                for(int j = 1; j <= 3; j++){
                    for(int k = 0; k <= 2; k++){
                        if(i+k == 10){
                            break;
                        }
                        System.out.printf("%2d*%d=%-2d", i+k, j, (i+k)*j);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            else {
                continue;
            }
        }
    }
}
