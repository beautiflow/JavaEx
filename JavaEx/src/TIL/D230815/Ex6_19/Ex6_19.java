package TIL.D230815.Ex6_19;

public class Ex6_19 {
    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:"+str);
    }

    public static void change(String str){
        str += "456";
    }
}
