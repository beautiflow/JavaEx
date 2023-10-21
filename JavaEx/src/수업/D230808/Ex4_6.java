package 수업.D230808;

public class Ex4_6 {
    public static void main(String[] args) {
        int[] dice1 = new int[7];
        int[] dice2 = new int[7];

        for (int i = 1; i < 7; i++) {
            dice1[i] = i;
            dice2[i] = i;
            for(int j = 1; j < 7; j++){
                if(dice1[i] + dice2[j] == 6){
                    if(i > j || i < j) {
                        System.out.printf("[%d, %d]%n", dice1[i], dice2[j]);
                    }
                     if(i == j){
                         System.out.printf("[%d, %d]%n", dice1[i], dice2[j]);
                     }
                }
                if(dice1[j] + dice2[i] == 6){
                    if(i > j || i < j) {
                        System.out.printf("[%d, %d]%n", dice1[j], dice2[i]);
                    }
                }
            }
        }
    }
}


