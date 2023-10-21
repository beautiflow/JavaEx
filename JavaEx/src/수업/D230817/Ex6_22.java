package 수업.D230817;

public class Ex6_22 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

        str = "1234ottt";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

    }

    public static boolean isNumber(String str){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= '1' && ch <= '9'){
               count++;
            }
        }
        if(count == str.length()){
            return true;
        }
        return false;
    }
}
