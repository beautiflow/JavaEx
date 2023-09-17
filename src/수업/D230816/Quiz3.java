package 수업.D230816;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Card {
    int num;
    String pattern;

    public Card(String pattern, int num) {
        this.pattern = pattern;
        this.num = num;
    }
}

public class Quiz3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Card[] Card = new Card[5];
        //   Card c = new Card("H", 1);
        //   Card c = new Card("H", 1);
        //   Card c = new Card("H", 1);
        //   Card c = new Card("H", 1);
        //   Card c = new Card("H", 1);



        for(int i = 0; i < Card.length; i++){
            st = new StringTokenizer(br.readLine());
            String pattern = st.nextToken();
            st = new StringTokenizer(br.readLine());
            int num =  Integer.parseInt(st.nextToken());

            Card[i] = new Card(pattern, num);
        }

        String rank = rankCheck(Card);
        System.out.println(rank);
    }

    public static String rankCheck(Card[] Card){
        int cnt = 0;
        int count = 0;
        int sameP = 0;
        int strai = 0;
        int[] num = new int[5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                // “1 PAIR” : 같은 숫자 한 쌍
                if(Card[i].num == Card[j].num){
                    cnt++;
                    if(cnt == 1){
                        return "1 PAIR";
                    }
                    // “2 PAIR” : 같은 숫자 두 쌍
                    else if (cnt == 2) {
                        return "2 PAIR";
                    }
                }
                if(Card[i].num == Card[j].num && Card[i].pattern == Card[j].pattern){
                    count++;
                    //“THREE CARD” : 같은 카드 세 장
                    if(count == 3){
                        return "THREE CARD";
                    }
                    // “FOUR CARD” : 같은 카드 네 장
                    else if(count == 4){
                        return "FOUR CARD";
                    }
                }
                // “FLUSH” : 같은 무늬 5장
                if(Card[i].pattern == Card[j].pattern){
                    sameP++;
                    if(sameP == 5){
                        return "FLUSH";
                    }

                }
                // “STRAIGHT” : 연속 숫자 5장 (2, 3, 4, 5, 6)
                num[i] = Card[i].num;
                Arrays.sort(num);
                while (i < 4){
                    if(num[i]+1 == num[i+1]){
                        strai++;
                        if(strai == 5){
                            return "STRAIGHT";
                        }
                    }
                }
                if(sameP == 5 && strai == 5){
                    return "STRAIGHT FLUSH";
                }
            }
        }
        return "NO RANK";
    }

}
