import buildings.Building;
import buildings.Flat;
import buildings.NoElectricityException;
import buildings.NoInternetException;
import providers.NoHoneyException;
import helpers.Silent;

public class C3W8 {
    public static final String NAME = " 8";
    public static void main(String[] args) throws Exception {
        Silent s = new Silent(5);
        Building b = new Flat();
        try {
            b.spend(1,2.5);
            System.out.println("WA" + NAME);
        } catch (NoElectricityException ex) {
            System.out.println("OK" + NAME);
        } catch (Exception ex) {
            System.out.println("WA" + NAME);
        }
    }
}
