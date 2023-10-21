package TIL.D230821.Ex7_22;

public class Point {
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

    @Override
    double calcArea() {
        double area = Math.pow(r, 2)*3.14;
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

    @Override
    double calcArea() {
        double area = width*height;
        return area;
    }

    public boolean isSquare(){
        if(width == height){
            return true;
        }
        return false;
    }
}

