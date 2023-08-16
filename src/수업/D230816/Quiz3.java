package 수업.D230816;

import java.util.Scanner;

class Card{
    int num;
    String pattern;

    public Card(String pattern, int num) {
        this.pattern = pattern;
        this.num = num;
    }
}

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Card = new String[5];
        Card c = new Card("H", 1);

        for(int i = 0; i < Card.length; i++){
            Card[i] = sc.nextLine();
        }

        String rank = rankCheck(Card);
        System.out.println(rank);
    }

    public static String rankCheck(String[] Card){
        int cnt = 0;

        for(int i = 0; i < Card.length; i++){
            for(int j = 0; j < Card.length; j++){
                if(Card[i] == Card[j]){
                    cnt++;
                    if(cnt == 3){
                        return "THREE CARD";
                    }
                    else if (cnt == 4) {
                        return "FOUR CARD";
                    }
                }
            }
        }
        return "";
    }

}
