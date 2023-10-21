package 자바의_정석.ch14.LamdaEx2;

public class LamdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {}; // Myfunction f = (MyFunction)(()->{});
        Object obj = (MyFunction)(()->{}); // Object 타입으로 형변환이 생략됨
        String str = ((Object) (MyFunction)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        // System.out.println(()->{});   // 에러. 랍다식은 Object 타입으로 형변환 안됨
        System.out.println((MyFunction)(()->{}));
        // System.out.println((MyFunction)(()->{}).toString()); // 에러.
        System.out.println(((Object) (MyFunction)(()->{})).toString());
    }
}

@FunctionalInterface
interface MyFunction{
    void myMethod();  // public abstract void myMethod();
}
