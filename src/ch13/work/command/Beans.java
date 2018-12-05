package ch13.work.command;

public class Beans implements Commodity
{
    Float price;

    public Beans()
    {
        this.price = 7.0f;
    }

    @Override
    public Float getPrice() {
        return this.price;
    }
}
