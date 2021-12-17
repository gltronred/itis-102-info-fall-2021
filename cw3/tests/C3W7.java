import buildings.Building;
import buildings.Office;
import buildings.NoElectricityException;
import buildings.NoInternetException;
import providers.NoHoneyException;
import helpers.Silent;

public class C3W7 {
    public static final String NAME = " 7";
    public static void main(String[] args) throws Exception {
        Silent s = new Silent(5);
        Silent s2 = new Silent(5);
        Building b = new Office();
        b.connectElectricity(s);
        b.connectElectricity(s2);
        b.connectInternet(s);
        b.spend(1,2.5);
        if (s.getE() != 0 || s2.getE() != 1) {
            System.out.println("WA" + NAME);
        } else {
            System.out.println("OK" + NAME);
        }
    }
}
