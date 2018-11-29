package ch13.work.facade;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
        // TODO: MATH
        // Do the math to draw a circle based on 2 (x, y) values
        // in this case centered within the bounds of the resultant rectangle
    }
}