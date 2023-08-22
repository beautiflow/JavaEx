package TIL.D230820;

// commit + => 호출과정 추가 / 생성자가 호출되는 순서와 메서드가 실행되는 순서는 반대이다

public class Ex7_7 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("x="+c.getX());
    }
}

class Parent{
    int x = 100;

    Parent(){
        this(200);
        System.out.println(4);
    }

    Parent(int x){
        System.out.println(1);
        this.x = x;
    }

    int getX(){
        System.out.println(2);
        return x;
    }
}

class Child extends Parent{
    int x = 300;

    Child(){
        this(1000);
        System.out.println(5);
    }

    Child(int x){
        System.out.println(3);
        this.x = x;
    }
}
