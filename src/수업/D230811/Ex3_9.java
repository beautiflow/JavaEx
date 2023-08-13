package 수업.D230811;

public class Ex3_9 {
    public static void main(String[] args) {
        char ch = 'Z';
        boolean b = (65 <= ch && ch <= 90) || (ch > '0' && ch <'9') || ((97 <= ch && ch <= 122));

        System.out.println(b);
    }
}
