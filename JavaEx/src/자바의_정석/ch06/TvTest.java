package 자바의_정석.ch06;

class Tv {

    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }

    void channelUp(){
        ++channel;
    }

    void channelDown(){
        --channel;
    }
}

public class TvTest{
    public static void main(String[] args) {

        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        t.channelUp();
        t.channelUp();
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}
