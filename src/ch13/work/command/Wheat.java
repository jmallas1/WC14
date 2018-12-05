package ch13.work.command;

public class Wheat implements Commodity
{
    Float price;

    public Wheat()
    {
        this.price = 9.0f;
    }

    @Override
    public Float getPrice() {
        return this.price;
    }
}
