package beverages;

import java.util.ArrayList;
import java.util.List;

public class HotChocolate extends Beverage {

    public HotChocolate() {
        super(new ArrayList<>());
    }

    public HotChocolate(List<Supplement> supplements) {
        super(supplements);
    }

    @Override
    public double price() {
        return 1.45;
    }
}
