package unit_tests;

import beverages.*;
import supplements.*;
import java.util.ArrayList;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Beverage tea    = new Tea();
        Supplement milk = new MilkSupplement();
        tea.addSupplement(milk);
        assertThat(tea.total(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Supplement milk = new MilkSupplement();
        ArrayList<Supplement> list = new ArrayList<Supplement>();
        list.add(milk);

        Beverage coffee = new Coffee(list);
        assertThat(coffee.total(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Supplement milk  = new MilkSupplement();
        Supplement cream = new CreamSupplement();
        //
        ArrayList<Supplement> list = new ArrayList<Supplement>();
        list.add(milk);
        list.add(cream);
        //
        Beverage coffee = new Coffee(list);
        assertThat(coffee.total(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        Supplement cream = new CreamSupplement();
        //
        ArrayList<Supplement> list = new ArrayList<Supplement>();
        list.add(cream);
        //
        Beverage hotChocolate = new HotChocolate(list);
        assertThat(hotChocolate.total(),  is(closeTo(1.60, 0.001)));
    }
}
