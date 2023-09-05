package 자바의_정석.ch14;

public class LamdaEx1 {
    static void execute(MyFunction f){  // 매개변수의 타입이 Myfunction 인 메서드
        f.run();
    }

    static MyFunction getMyFunction(){  // 반환 타입이 Myfunction 인 메서드
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        // 랍다식으로 MyFunction 의 run() 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {  // 익명클래스로 run() 구현
            public void run() { // public 을 반드시 붙여야 함
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }
}

@FunctionalInterface
interface MyFunction{
    void run(); // public abstract void run();
}


