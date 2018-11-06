import temperature.Temperature;

public class Main {

    public static void main(String[] args) {

        Temperature tmp = new Temperature(3);

        Temperature ttp = new Temperature();
        ttp.setValue(20);
        System.out.println("Temperature value is: " + ttp.getValue() + " Second value is: "+tmp.getValue());
    }
}
    // metode kelvina i ferenhajta preko gettera i settera