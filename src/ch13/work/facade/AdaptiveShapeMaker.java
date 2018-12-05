package ch13.work.facade;

import java.util.ArrayList;

public class AdaptiveShapeMaker
{
    private int x1, y1, x2, y2;

    public AdaptiveShapeMaker(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void drawAllShapes()
    {
        ArrayList<Adapter> adapterList = new ArrayList();

        adapterList.add(new CircleAdapter(new Circle()));
        adapterList.add(new LineAdapter(new Line()));
        adapterList.add(new RectangleAdapter(new Rectangle()));
        adapterList.add(new SquareAdapter(new Square()));

        for (Adapter shapeAdapter : adapterList)
        {
            shapeAdapter.draw(x1, y1, x2, y2);
        }
    }
}
