package bar;

import drinks.Drink;
import stock.Stock;

public class Bar {

    private Stock alcoholicDrinks;
    private Stock nonAlcoholicDrinks;

    public Bar (Stock alcoholicDrinks, Stock nonAlcoholicDrinks){
        this.alcoholicDrinks = alcoholicDrinks;
        this.nonAlcoholicDrinks = nonAlcoholicDrinks;
    }

    public Stock getAlcoholicDrinks() {
        return alcoholicDrinks;
    }

    public void setAlcoholicDrinks(Stock alcoholicDrinks) {
        this.alcoholicDrinks = alcoholicDrinks;
    }

    public Stock getNonAlcoholicDrinks() {
        return nonAlcoholicDrinks;
    }

    public void setNonAlcoholicDrinks(Stock nonAlcoholicDrinks) {
        this.nonAlcoholicDrinks = nonAlcoholicDrinks;
    }

    public void addDrinkToStock (Drink drink, Stock stock){
        stock.addDrinks(drink);
    }
}
