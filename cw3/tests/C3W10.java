import buildings.Building;
import buildings.Flat;
import buildings.NoElectricityException;
import buildings.NoInternetException;
import providers.NoHoneyException;
import helpers.Silent;

public class C3W10 {
    public static final String NAME = " 10";
    public static void main(String[] args) throws Exception {
        Silent s = new Silent(5);
        Building b = new Flat();
        b.connectElectricity(s);
        b.connectInternet(s);
        b.spend(1,2.5);
        if (s.getE() != 1 || s.getI() != 2.5) {
            System.out.println("WA" + NAME);
        } else {
            System.out.println("OK" + NAME);
        }
    }
}
