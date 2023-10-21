package TIL.D230828;

import java.util.EnumSet;

public class ColorEnum {
    public static void main(String[] args) {
        // 정적 팩토리 메서드를 통해 RegularEnumSet 혹은 JumboEnumSet 을 반환
        // 만일 enum 상수 원소 갯수가 64개 이하면 RegularEnumSet, 이상이면 JumboEnumSet 객체를 반환
        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);

        for(Color color : enumSet){
            System.out.println(color);
        }

        enumSet.size(); // 6
        enumSet.toString(); // [ RED, YELLOW, GREEN, BLUE, BLACK, WHITE]
    }
}

enum Color{
    RED, YELLOW, GREEN, BLUE, BLACK, WHITE
}
