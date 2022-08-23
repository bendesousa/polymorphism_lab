package stock;

import drinks.Beer;
import drinks.Drink;
import drinks.Wine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockTest {

    private Stock stock;

    @BeforeEach
    public void setUp(){
        stock = new Stock ("imaginary stock");
    }

    @Test
    public void canCountDrinks(){
        int expected = 0;
        int actual = stock.countDrinks();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddDrink(){
        Drink drink = new Beer("Fosters", true, "tall");
        stock.addDrinks(drink);
        int expected = 1;
        int actual = stock.countDrinks();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddMultipleDrinks() {
        Drink beer = new Beer("Fosters", true, "tall");
        Drink wine = new Wine("House Wine", true, "short");
        stock.addDrinks(beer);
        stock.addDrinks(wine);
        int expected = 2;
        int actual = stock.countDrinks();
        assertEquals(expected, actual);
    }
}
