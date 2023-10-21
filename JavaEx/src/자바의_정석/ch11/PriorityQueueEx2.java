package 자바의_정석.ch11;

import java.util.PriorityQueue;
import java.util.Queue;

// https://inpa.tistory.com/entry/JCF-%F0%9F%A7%B1-Collections-Framework-%EC%A2%85%EB%A5%98-%EC%B4%9D%EC%A0%95%EB%A6%AC#priorityqueue_%ED%81%B4%EB%9E%98%EC%8A%A4
// 참조해서 공부한 코드

public class PriorityQueueEx2 {
    public static void main(String[] args) {

        // 오름차순 우선순위 큐
        Queue<Student> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Student("주몽",  5));
        priorityQueue.add(new Student("세종",  9));
        priorityQueue.add(new Student("홍길동",  1));
        priorityQueue.add(new Student("임꺽정",  2));

        System.out.println("우선순위 대로 정렬되어 있다.");
        System.out.println(priorityQueue);
        System.out.println();

        System.out.println("우선순위가 가장 높은 값을 참조");
        System.out.println(priorityQueue.peek());
        System.out.println();

        System.out.println("차례대로 꺼내기");
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}

class Student implements Comparable<Student>{
    String name;  // 학생 이름
    int priority; // 우선 순위 값

    public Student(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Student user){
        // Student 의 priority 필드 값을 비교하여 우선순위를 결정하여 정렬
        if(this.priority < user.priority){
            return -1;
        }
        else if (this.priority == user.priority){
            return 0;
        }
        else {
            return 1;
        }
    }

    @Override
    public String toString(){
        return "Student{ " + "name = '" + name +'\''+ ", priority = " + priority +'}';
    }
}
