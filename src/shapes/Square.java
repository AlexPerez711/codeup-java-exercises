package shapes;
//
//public class Square extends Rectangle {
//    public double side;
//
//    public Square(double side){
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getPerimeter(){
//        return side * 4;
//    }
//
//    public double getArea(){
//        return Math.pow(side, 2);
//    }
//}

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
