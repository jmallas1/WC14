package ch13.work.facade;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");

        // TODO: MATH
        // Do the math to draw a rectangle based on 2 (x, y) values
        // in this case the two points are the opposite corners of the rectangle
    }
}
