package Section52.Week5;

public class Syrup {
    private String flavor;

    public Syrup(String aFlavor){
        flavor = aFlavor;
    }

    //Get Method
    public String getFlavor(){
        return flavor;
    }

    //Set Method
    public void setFlavor(String newFlavor){
        flavor = newFlavor;
    }

    public String toString(){
        return flavor + " syrup";
    }
}
