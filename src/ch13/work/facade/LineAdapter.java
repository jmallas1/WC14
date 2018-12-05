package ch13.work.facade;

public class LineAdapter implements Adapter
{
    private Shape line;

    public LineAdapter()
    {
        this.line = new Line();
    }

    public LineAdapter(Shape line)
    {
        this.line = line;
    }

    public void draw(int x1, int y1, int x2, int y2)
    {
        this.line.draw(x1, y1, x2, y2);
    }
}

