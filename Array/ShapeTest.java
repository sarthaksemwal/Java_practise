class Overriding{
    public void area(){
        System.out.println("Area of shape");
    }
    public void perimeter(){
        System.out.println("Perimeter of shape");
    }
}

class Rectangle extends Overriding{
    public void area(){
        int l=10, b=20;
        System.out.println("Area of rectangle: "+(l*b));
    }
    public void perimeter(){
        int l=10, b=20;
        System.out.println("Perimeter of rectangle: "+(2*(l+b)));
    }
}

class Circle extends  Overriding{
    public void area(){
        int r=10;
        System.out.println("Area of circle: "+(3.14*r*r));
    }
    public void perimeter(){
        int r=10;
        System.out.println("Perimeter of circle: "+(2*3.14*r));
    }
}

public class ShapeTest {
    public static void main(String[] args){
        Overriding s = new  Overriding();
        s.area();
        s.perimeter();

        Rectangle r = new Rectangle();
        r.area();
        r.perimeter();

        Circle c = new Circle();
        c.area();
        c.perimeter();
    }
}
