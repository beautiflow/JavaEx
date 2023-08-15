package TIL.D230815;

interface Calculable{
    double PI = 3.14; // 변수를 정의할 때는 내용을 적는다.
    int sum(int v1, int v2);
}

interface Printable{
    void print();
}

class RealCal implements Calculable, Printable  {
    public int sum(int v1, int v2) {
        return v1+v2;
    }

    public void print(){
        System.out.println("This is ReaCal!");
    }
}

class AdvancedPrint implements Printable  {
    public void print(){
        System.out.println("This is ReaCal!");
    }
}

class DummyCal implements Calculable{
    public int sum(int v1, int v2){
        return 3;
    }
}

public class InterfaceApp {
    public static void main(String[] args) {
        // 더하기 기능이 있는 클래스를 만들어주세요.
        Printable c = new AdvancedPrint();
     //   System.out.println(c.sum(2,1));
        c.print();
      //  System.out.println(c.PI);

    }
}


/*
다형성
비유 : 전자제품에 기능이 엄청 많으면 좋은가? 배워야하는 부담감이 많다.
        나한테 필요한 기능만 보여주면 좋겠다~
        기능을 감출 수 있다.
 */

