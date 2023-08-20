package TIL.D230820;

public class Ex7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}

class Product{
    int price;
    int bonusPoint;

    Product(){} // Product 클래스에 기본 생성자가 없어서 발생하는 에러이다. Product 기본 생성자를 추가해주어야 한다.

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product{
    Tv(){}

    public String toString(){
        return "TV";
    }
}




