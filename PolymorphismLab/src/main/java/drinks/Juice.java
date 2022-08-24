package drinks;

import interfaces.IChill;

public class Juice extends Drink implements IChill {

    public Juice(String name, boolean alcoholic, String type){
        super(name, alcoholic, type);
    }

    public String appleOrOrange(){
        return "Would you like apple or orange juice?";
    }

    public String chill (boolean chill){
        return String.format("Should ice be added to the juice: %s.", chill);
    }

}
