package ch13.work.command;

public class Corn implements Commodity
{
    Float price;
    public Corn()
    {
        this.price = 4.0f;
    }

    @Override
    public Float getPrice() {
        return this.price;
    }
}
