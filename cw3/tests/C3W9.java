import buildings.Building;
import buildings.Flat;
import buildings.NoElectricityException;
import buildings.NoInternetException;
import providers.NoHoneyException;
import helpers.Silent;

public class C3W9 {
    public static final String NAME = " 9";
    public static void main(String[] args) throws Exception {
        Silent s = new Silent(5);
        Building b = new Flat();
        b.connectElectricity(s);
        try {
            b.spend(1,2.5);
            System.out.println("WA" + NAME);
        } catch (NoInternetException ex) {
            System.out.println("OK" + NAME);
        } catch (Exception ex) {
            System.out.println("WA" + NAME);
        }
    }
}
