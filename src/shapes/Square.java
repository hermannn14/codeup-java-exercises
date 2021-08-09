package shapes;

public class Square extends Quadrilateral {

    public Square (int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

//    @Override
//    public int getArea() {
//        return super.length * super.width;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * super.length;
//    }
}
