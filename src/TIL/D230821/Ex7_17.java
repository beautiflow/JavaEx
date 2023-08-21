package TIL.D230821;

public class Ex7_17 {
    int x, y;
    void move(int x, int y){}
    void stop(){}

}

class Marine extends Ex7_17 {

    @Override
    void move(int x, int y) {
        super.x = x;
        super.y = y;
    }

    @Override
    void stop() {

    }
}
