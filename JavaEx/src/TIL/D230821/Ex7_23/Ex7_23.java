package TIL.D230821.Ex7_23;

public class Ex7_23{

    public static double sumArea(Shape[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += (double) arr[i].calcArea();
        }
        return sum;
    }


    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("면적의 합 : " + sumArea(arr));
    }
}


class Point {
    int x;
    int y;

    Point(){
        this(0,0);
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "["+x+", "+y+"]";
    }
}

abstract class Shape{
    Point p;

    Shape(){
        this(new Point(0,0));
    }

    Shape(Point p){
        this.p = p;
    }

    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

    void setPosition(Point p){
        this.p = p;
    }
}

class Circle extends Shape{

    double r;

    Circle(double a){
        this.r = a;
    };

    double calcArea() {
        double area = (double) Math.pow(r, 2)*3.14;
        return area;
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }

    double calcArea() {
        double area = (double) width*height;
        return area;
    }

    public boolean isSquare(){
        if(width == height){
            return true;
        }
        return false;
    }
}

