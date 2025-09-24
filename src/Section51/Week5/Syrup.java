package Section51.Week5;

public class Syrup {
    //Attribute(s)
    private String flavor;

    //Constructor
    public Syrup(String aFlavor){
        flavor = aFlavor;
    }

    //Get method
    public String getFlavor(){
        return flavor;
    }

    //Set method
    public void setFlavor(String newFlavor){
        flavor = newFlavor;
    }

    public String toString(){
        return flavor + " syrup";
    }
}
