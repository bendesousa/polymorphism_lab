package stock;

import drinks.Drink;

import java.util.ArrayList;

public class Stock {

    private String name;
    private ArrayList<Drink> drinks;

    public Stock(String name){
        this.name = name;
        this.drinks = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Drink> getDrinks(){
        return drinks;
    }

    public void setDrinks(ArrayList<Drink> drinks){
        this.drinks = drinks;
    }

    public int countDrinks(){
        return this.drinks.size();
    }

    public void addDrinks(Drink drink){
        this.drinks.add(drink);
    }
}
