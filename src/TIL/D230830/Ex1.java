package TIL.D230830;

import java.util.Comparator;

public class Ex1 {
    public static void main(String[] args) {

    }

}

class Student{
    String name;
    int ban;
    int no;
    int kor, eng, math;
    int total;

    public Student(String name, int ban, int no, int kor, int eng, int math, int total) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = total;
    }

    public int compareTo(Object o){
        if(o instanceof Student){
            Student tmp = (Student) o;

            return name.compareTo(tmp.name); // String 클래스의 compareTo 호출
        }
        else {
            return -1;
        }
    }

    public int compateTo(Object o){
        if(o instanceof Student){
            Student tmp = (Student) o;
            return tmp.total - this.total;
        }
        else {
            return -1;
        }
    }
}

class BanNoAscending implements Comparator{
    public int compare(Object o1, Object o2){
        if(o1 instanceof Student && o2 instanceof Student){
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;

            int result = s1.ban - s2.ban;

            if(result == 0){
                return s1.no - s2.no;
            }
            return result;
        }
        return -1;
    }
}
