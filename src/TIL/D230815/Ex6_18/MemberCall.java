package TIL.D230815.Ex6_18;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int ic2 = cv;
   // static int cv2 = iv; // 라인 A : static 변수에 instance 변수 초기화 안됨. 객체 생성후 사용 가능

    static void staticMethod1(){
        System.out.println(cv);
  //      System.out.println(iv); // 라인 B : 인스턴스 변수는 static method 에서 사용 x
    }

    void instaceMethod1(){
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2(){
        staticMethod1();
   //     instaceMethod1(); // 라인 D : staic method가 아닌 instance method는 바로 호출 x
    }

    void instanceMethod2(){
        staticMethod1();
        instaceMethod1();
    }
}
