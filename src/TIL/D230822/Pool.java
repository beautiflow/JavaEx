package TIL.D230822;

//  Java에서 String은 불변(Immutable) memory

public class Pool {
    public static void main(String[] args) {
        String str = "abc";  // "def 가 생성되면 가비지컬렉터에 의해 먼저 생성되었던 "abc" 는 사라진다.
        str = "def";
        str = "abc";

        System.out.println(str);
    }
}
