package ch13.work.facade;

public class SquareAdapter implements Adapter
{
    private Shape square;

    public SquareAdapter()
    {
        this.square = new Square();
    }

    public SquareAdapter(Shape square)
    {
        this.square = square;
    }

    public void draw(int x1, int y1, int x2, int y2)
    {
        this.square.draw(x1, y1, x2, y2);
    }
}
