package 수업.D230810;

public class Ex5_7 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("USAGE: java Exercise5_7 3120");
            System.exit(0);
        }

        // 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
        int money = Integer.parseInt(args[0]);

        System.out.println("money=" + money);

        int[] coinUnit = {500, 100, 50, 10}; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수

        for (int i = 0; i < coinUnit.length; i++) {
            int coinNum = 0;

            // 1. money를 동전단위로 나눠서 필요한 동전의 개수를 구한다.
            // 2. 배열 coin에서 coinNum 만큼의 동전을 뺀다.
            // 3. 금액에서 동전의 개수와 동전단위를 곱한 값을 뺀다.
            int result = money;
            while (result >= coinUnit[i] && coinNum < 5) {
                coinNum++;
                money -= coinUnit[i];
                result = money;
            }

            coin[i] = coin[i] - coinNum;
            result -= coin[i] * coinNum;

            System.out.println(coinUnit[i] + "원 :" + coinNum);

        }


        if (money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0);
        }

        System.out.println("=남은 동전의 개수 =");

        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원: " + coin[i]);
        }
    }
}
