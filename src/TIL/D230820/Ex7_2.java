package TIL.D230820;

public class Ex7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }
        System.out.println();
        System.out.println(deck.pick());
    }
}

class SutdaDeck {
    static final int CARD_NUM = 20;
    static SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && num == 1 || num == 3 || num == 8;
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    public static void shuffle() {
        int i = (int) (Math.random() * 10) + 1;
        int j = (int) (Math.random() * 10) + 1;
        SutdaCard tmp = cards[i];
        cards[i] = cards[j];
        cards[j] = tmp;
    }


    public static SutdaCard pick(int index) {
        if (index < 0 || index >= cards.length) {
            return null;
        }
        return cards[index];
    }

    public static SutdaCard pick() {
        int index = (int) (Math.random() * 10) + 1;

        return cards[index];
    }
}


class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}


