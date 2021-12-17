import buildings.Building;
import buildings.Flat;
import buildings.NoElectricityException;
import buildings.NoInternetException;
import providers.NoHoneyException;
import helpers.Silent;
import helpers.SilentNet;

public class C3W5 {
    public static final String NAME = " 5";
    public static void main(String[] args) throws Exception {
        Silent s = new Silent(5);
        SilentNet s2 = new SilentNet(5);
        Building b = new Flat();
        b.connectElectricity(s);
        b.connectInternet(s);
        b.connectInternet(s2);
        b.spend(1,2.5);
        if (s.getE() != 1 || s.getI() != 0 || s2.getI() != 2.5) {
            System.out.println("WA" + NAME);
        } else {
            System.out.println("OK" + NAME);
        }
    }
}
