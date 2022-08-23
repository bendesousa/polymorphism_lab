package bar;

import drinks.Drink;
import drinks.Wine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stock.Stock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarTest {

    private Bar bar;
    private Stock cheapStock;
    private Stock expensiveStock;

    @BeforeEach
    public void setUp(){
        cheapStock = new Stock("Cheap Stock");
        expensiveStock = new Stock("Expensive Stock");
        bar = new Bar(cheapStock, expensiveStock);
    }

    @Test
    public void canAddDrinkToStock(){
        Drink drink = new Wine("House Wine", true, "short");
        bar.addDrinkToStock(drink, expensiveStock);
        int expected = 1;
        int actual = expensiveStock.countDrinks();
        assertEquals(expected, actual);
    }

}
