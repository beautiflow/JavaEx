package 자바의_정석.ch02;
// 정수형을 실수형으로 변환

public class CastingEx4 {
    public static void main(String[] args) {
        int i = 91234567; // 8자리의 10진수
        float f = (float) i;  // int 를 float 로 형변환
        int i2 = (int) f; // float 를 다시 int 로 형변환

        double d = (double) i; // int 를 double로 형변환
        int i3 = (int)d;  // double 을 다시 int로 형변환

        float f2 = 1.666f;
        int i4 = (int)d;

        System.out.printf("i=%d\n", i);
        System.out.printf("f=%f, i2=%d\n", d, i2);
        System.out.printf("d=%f, i3=%d\n", d, i3);
        System.out.printf("(int)%f=%d\n", f2, i4);

    }
}
