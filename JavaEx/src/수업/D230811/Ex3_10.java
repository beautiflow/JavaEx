package 수업.D230811;

public class Ex3_10 {
    public static void main(String[] args) {
        char ch = 'B';

        char lowerCase = (65 <= ch && ch <= 122) ? (char) (ch + 32) : ch;

        System.out.println("ch:"+ch);
        System.out.println(lowerCase);
    }
}
