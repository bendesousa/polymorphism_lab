package drinks;

public class Wine extends Drink{

    public Wine(String name, boolean alcoholic, String type){
        super (name, alcoholic, type);
    }

    public String redOrWhite(){
        return "Would you like red or white?";
    }

}
