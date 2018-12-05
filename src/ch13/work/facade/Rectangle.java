package ch13.work.facade;

public class Rectangle implements Shape
{
    @Override
    public void draw(int x1, int y1, int x2, int y2)
    {
        System.out.println("Rectangle::draw(with coords)");

        // TODO: MATH
        // Do the math to draw a rectangle based on 2 (x, y) values
        // in this case the two points are the opposite corners of the rectangle
    }

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
