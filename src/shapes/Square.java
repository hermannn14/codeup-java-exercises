package shapes;

public class Square extends Quadrilateral {

    public Square (double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;

    }

    @Override
    public void setWidth(double width) {
        this.width = width;

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
