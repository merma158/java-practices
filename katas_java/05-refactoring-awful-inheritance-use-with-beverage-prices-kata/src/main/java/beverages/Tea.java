package beverages;

import java.util.ArrayList;
import java.util.List;

public class Tea extends Beverage {

    public Tea() {
        super(new ArrayList<>());
    }

    public Tea(List<Supplement> supplements) {
        super(supplements);
    }

    @Override
    public double price() {
        return 1.5;
    }
}
