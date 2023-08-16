package TIL.D230816.Promise;

interface Promise {
    public void info();
}

class Calculator implements Promise{
    int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public void info() {
        System.out.println("Calculator Info");
    }
}

public class Application{
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.info();
    }
}


