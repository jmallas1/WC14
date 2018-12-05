package ch13.work.command;

public class CommodityFactory
{
    public Commodity genCommodity(CommodityType type)
    {
        switch (type)
        {
            case CORN: return new Corn();
            case BEANS: return new Beans();
            case WHEAT: return new Wheat();
            default: return null;
        }
    }
}
