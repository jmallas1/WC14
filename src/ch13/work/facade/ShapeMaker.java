package ch13.work.facade;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    private Shape line;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
        line = new Line();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
    public void drawLine(){
        line.draw();
    }
}
