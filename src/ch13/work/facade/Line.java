package ch13.work.facade;

public class Line implements Shape
{
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Line::draw(with coords)");

        // TODO: MATH
        // Do the math to draw a line based on 2 (x, y) values
        // in this case connecting the first point to the next point
    }

    @Override
    public void draw() {
        System.out.println("Line::draw()");
    }
}
