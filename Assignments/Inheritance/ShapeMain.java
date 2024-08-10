class Shape{
    int l;
    double r;
    Shape(int i){
        this.l=i;
    }
    Shape(double i){
        this.r=i;
    }

}
class Circle extends Shape{
    Circle(double r){
        super(r);
    }
    double area(){
        return (3.14*(r*r));
    }
}
class Rectangle extends Shape{
    int b;
    Rectangle(int l,int b){
        super(l);
        this.b=b;
    }
    int area(){
        return l*b;
    }

}
class Square extends Shape{
    Square(int l){
        super(l);
    }
    int area(){
        return l*l;
    }
}
public class ShapeMain {

    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        Rectangle r = new Rectangle(3, 6);
        Square s = new Square(4);
        System.out.println("Area of the Circle : " + c.area());
        System.out.println("Area of the Rectangle : " + r.area());
        System.out.println("Area of the Square : " + s.area());
    }
}