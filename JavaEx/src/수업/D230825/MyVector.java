package 수업.D230825;

public class MyVector {
    Object[] objArr = {};
    int capacity;
    int size;

    MyVector(int capacity){
        this.capacity = capacity;
    }

    MyVector(){
        this(16);
    }

    // size 의 값 반환
    public int size(){
        return size;
    }

    // 배열 objArr 의 길이를 반환
    public int capacity(){
        return objArr.length;
    }

    // 객체 배열이 비었는지 확인 언제 비우는지
    public boolean isEmpty(){
        if(objArr.length > 0){
            return true;
        }
        return false;
    }

    // 객체 배열 objArr 에 객체를 추가
    // obj 를  배열(objArr) 뒤에 추가한다
    public void add(Object obj){
        objArr[size++] = obj;
    }

    // 객체 배열 objArr 에 저장된 객체를 반환
    public Object get(int index){
        return objArr[index];
    }

    // 객체 배열 objArr 에 저장된 모든 객체를 문자열로 이어서 반환
    public String toString(){
        StringBuilder strArr = new StringBuilder();
        for(int i = 0; i < objArr.length; i++){
            strArr.append(size).append(" ").append(capacity);
        }
        return strArr.toString();
    }

    // 객체 배열 objArr 에서 지정된 객체가 저장되어 있는 위치(index)를 반환하는 int indexOf(Object obj) 를 작성
    public int indexOf(Object obj){
        for(int i = 0; i < objArr.length; i++){
            if(obj.equals(objArr[i])){
                return i;
            }
        }
        return -1;
    }


    // 객체 배열 objArr 에서 지정된 객체를 삭제하는 boolean remove(Object obj) 를 작성 // indexOf() 이용하기
    public boolean remove(Object obj){
        for(int i = 0; i < objArr.length; i++){
            if(obj.equals(objArr[i])){
                remove(i);
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        MyVector v = new MyVector();
        v.add("abc");
        System.out.println(v);
    }



}

