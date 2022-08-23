package drinks;

public class Beer extends Drink {

    private boolean isFlat;

    public Beer(String name, boolean alcoholic, String type, boolean isFlat){
        super (name, alcoholic, type);
        this.isFlat = isFlat;
    }

    public String offerReplacement(){
        if (isFlat = true);
        return "Would you like a replacement?";
    }
}
