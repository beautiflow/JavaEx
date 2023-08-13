package 수업.D230809;

public class Ex4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            sum += Integer.parseInt(String.valueOf(ch));
        }

        System.out.println("sum = "+sum);
    }
}
