public class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3);
        System.out.println("Area of the rectangle is: " + r.area());
        System.out.println("Perimeter of the rectangle is: " + r.perimeter());
    }
}