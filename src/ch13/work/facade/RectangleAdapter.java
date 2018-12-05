package ch13.work.facade;

public class RectangleAdapter implements Adapter
{
    private Shape rectangle;

    public RectangleAdapter()
    {
        this.rectangle = new Rectangle();
    }

    public RectangleAdapter(Shape rectangle)
    {
        this.rectangle = rectangle;
    }

    public void draw(int x1, int y1, int x2, int y2)
    {
        this.rectangle.draw(x1, y1, x2, y2);
    }
}
