public class Square extends Shape {
    protected double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double area() {
        return sideLength * sideLength;
    }

    public double perimeter() {
        return sideLength * 4;
    }
}
