package 수업.D230811;

import java.util.Scanner;

public class Ex5_13 {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < words.length; i++){
            char[] question = words[i].toCharArray();

            int num = (int)(Math.random()* words.length)+1;

            for(int j = 1; j <= num; j++){
                char tmp = question[j-1];
                question[j-1] = question[j];
                question[j] = tmp;
            }


            System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
            String answer = scanner.nextLine();

            // trim으로 answer 의 좌우공백을 제거한 후, equals 로 word[i]와 비교
            if(words[i].equals(answer.trim())){
                System.out.printf("맞았습니다.%n%n");
            }
            else {
                System.out.printf("틀렸습니다.%n%n");
            }
        }
    }
}
