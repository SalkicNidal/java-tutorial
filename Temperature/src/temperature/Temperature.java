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

    //toString
    @Override
    public String toString() {
        return "Temperature value is " + value;

    }

    //convert to Kelvin
     public double convertToKalvin(double value){
         return value + 273;

    }

    //convert to Fahrenheit
    public double convertToFahrenheit(double value) {
         return value + 33.80000;
    }


}




