package drinks;

public class Beer extends Drink {

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
}
