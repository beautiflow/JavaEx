package 수업.D230817;

public class Ex6_24 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));
    }

    public static int abs(int value){
        if(value < 0){
            return -value;
        }
        return value;
    }
}
