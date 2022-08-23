package drinks;

public abstract class Drink {

    private String name;
    private boolean alcoholic;
    private String type;

    public Drink (String name, boolean alcoholic, String type) {
        this.name = name;
        this.alcoholic = alcoholic;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String requireId(){
        if(alcoholic = true);
        return "Can I see your ID?";
    }

    public String offerStraw(){
        if(type == "tall");
        return "Would you like a straw?";
    }

}
