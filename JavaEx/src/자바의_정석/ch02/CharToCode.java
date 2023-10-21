package 자바의_정석.ch02;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A'; // char ch = 65;
        int code = (int) ch; // ch에 저장된 값을 Int 타입으로 변환하여 저장한다.

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = '가'; // char ch = 0xAC00;
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);

    }
}
