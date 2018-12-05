package ch13.work.facade;

public class Main {

    public static void main(String[] args)
    {
        // Create a list of adapters that will 2 coordinates (x, y)
        // and translate them into instructions of drawCircle,
        // drawRectangle, drawSquare, and drawLine

        // This is the facade.
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        // Add a new facade (AdaptiveShapeMaker) which will take in
        // the coords and draw the shapes via their adapters.
        AdaptiveShapeMaker asm = new AdaptiveShapeMaker(1, 1, 10, 10);
        asm.drawAllShapes();
    }
}

