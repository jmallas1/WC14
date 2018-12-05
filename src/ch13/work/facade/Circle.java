package ch13.work.facade;

public class Circle implements Shape {
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Circle::draw(with coords)");
        // TODO: MATH
        // Do the math to draw a circle based on 2 (x, y) values
        // in this case centered within the bounds of the resultant rectangle
    }

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}