package ch13.work.facade;

public class CircleAdapter implements Adapter
{
    private Shape circle;

    public CircleAdapter()
    {
        this.circle = new Circle();
    }

    public CircleAdapter(Shape circle)
    {
        this.circle = circle;
    }

    public void draw(int x1, int y1, int x2, int y2)
    {
        this.circle.draw(x1, y1, x2, y2);
    }
}
