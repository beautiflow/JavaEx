package TIL.D230816;

public class Main {
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = new String("Hello").intern();
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
