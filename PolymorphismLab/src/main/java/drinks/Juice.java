package drinks;

public class Juice extends Drink{

    public Juice(String name, boolean alcoholic, String type){
        super(name, alcoholic, type);
    }

    public String appleOrOrange(){
        return "Would you like apple or orange juice?";
    }
}
