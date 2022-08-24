package drinks;

import interfaces.IChill;

public class Beer extends Drink implements IChill {

    private boolean isFlat;

    public Beer(String name, boolean alcoholic, String type){
        super (name, alcoholic, type);
        this.isFlat = true;
    }

    public boolean getIsFlat(){
        return this.isFlat;
    }

    public void setFlat(boolean isFlat){
        this.isFlat = isFlat;
    }

    public String offerReplacement() {
        if (isFlat == true) {
            return "Let me get you another.";
        } else {
            return "Enjoy your drink!";
        }
    }

    public String chill (boolean chill){
        return String.format("Should ice be added to the beer: %s", chill);
    }
}
