import temperature.Temperature;

public class Main {

    public static void main(String[] args) {

        Temperature tmp = new Temperature(3);

        Temperature ttp = new Temperature();
        ttp.setValue(20);
        System.out.println(ttp.convertToFahrenheit(1));
    }

}



