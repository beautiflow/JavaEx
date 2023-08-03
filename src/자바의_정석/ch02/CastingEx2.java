package 자바의_정석.ch02;
// 정수형간의 형변환

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

        i = 300;
        b = (byte) i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

        b = 10;
        i = (int) b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

        b = -2;
        i = (int) b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

        System.out.printf("i="+Integer.toBinaryString(i));

    }
}
