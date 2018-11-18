import jdk.nashorn.internal.objects.annotations.Setter;

public class Main {

    public static void main(String[] args) {

        Glass myGlass = new Glass(5);
        Glass secondGlass = new Glass();

        myGlass.setAmount(3);
        
        secondGlass.setAmount(2);
        secondGlass.setLiquid("coca cola");
        secondGlass.setMax(5);

        System.out.println(myGlass.toString());
        System.out.println(secondGlass.toString());
    }
}
