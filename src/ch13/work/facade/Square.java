package ch13.work.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");

        // TODO: MATH
        // Do the math to draw a square based on 2 (x, y) values
        // in this case first set of (x, y) is origin and the length
        // is that of half the resultant rectangle
    }
}
