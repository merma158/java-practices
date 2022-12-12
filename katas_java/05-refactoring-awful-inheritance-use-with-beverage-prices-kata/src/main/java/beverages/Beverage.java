package beverages;

import supplements.Supplement;
import java.util.List;

abstract class Beverage {
    private final List<Supplement> supplements;

    public Beverage(List<Supplement> supplements)
    {
        this.supplements = supplements;
    }

    public void addSupplement(Supplement supplement)
    {
        this.supplements.add(supplement);
    }

    public double total()
    {
        return price() + supplements.stream().map(Supplement::price).reduce(0d, Double::sum);
    }

    abstract double price();
}
