package beverages;

import java.util.ArrayList;
import java.util.List;

public class Coffee extends Beverage {

    public Coffee()
    {
        super(new ArrayList<>());
    }

    public Coffee(List<Supplement> supplements) {
        super(supplements);
    }

    @Override
    public double price() {
        return 1.2;
    }
}
