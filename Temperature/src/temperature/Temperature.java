package temperature;

public class Temperature {

    private int value;

    // defaultni konstruktor
    public Temperature(){
        super();
    }

    // constructor with field
    public Temperature(int value){
        this.value = value;
    }

    //getter
    public int getValue(){
        return value;
    }

    //setter
    public void setValue(int value){
        this.value = value;
    }
}
