package 수업.D230807;

public class Quiz1 {
    public static void main(String[] args) {

        System.out.println("[Quiz1.1]");
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d, %d%n", i, i-1);
        }
        System.out.println();

        System.out.println("[Quiz1.2]");
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d, %d%n", i, 2*i);
        }
        System.out.println();

        System.out.println("[Quiz1.3]");
        for(int i = 0; i < 9; i++){
            System.out.printf("%d, %d%n", i+1, 2*i);
        }
        System.out.println();

        System.out.println("[Quiz1.4]");
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d, %d%n", i, 2*i-1);
        }
        System.out.println();

        System.out.println("[Quiz1.5]");
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d, %d%n", i, i*i);
        }
        System.out.println();

        System.out.println("[Quiz1.6]");
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d, %d%n", i, 10-i);
        }
        System.out.println();

        System.out.println("[Quiz1.7.1]");
        for(int i = 1; i <= 9; i++) {
            if(i <= 3){
                System.out.printf("%d, %d%n", i, 1);
            }
            else if(i <= 6){
                System.out.printf("%d, %d%n", i, 2);
            }
            else {
                System.out.printf("%d, %d%n", i, 3);
            }
        }
        System.out.println();

        System.out.println("[Quiz1.7.2]");
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d, %d%n", i, (i+2)/3);
        }
        System.out.println();


        System.out.println("[Quiz1.8.1]");
        for(int i = 1; i <= 9; i++){
            if(i%3 == 1){
                System.out.printf("%d, %d%n", i, 1);
            }
            else if (i%3 == 2) {
                System.out.printf("%d, %d%n", i, 2);
            }
            else {
                System.out.printf("%d, %d%n", i, 3);
            }
        }
        System.out.println();


        System.out.println("[Quiz1.8.2]");
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d, %d%n", i, (i+2)%3+1);
        }
        System.out.println();

    }
}
