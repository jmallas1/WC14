package ch13.work.facade;

public class Square implements Shape
{
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Square::draw(with coords)");

        // TODO: MATH
        // Do the math to draw a square based on 2 (x, y) values
        // in this case first set of (x, y) is origin and the length
        // is that of half the resultant rectangle
    }

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }

}
