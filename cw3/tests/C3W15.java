import buildings.Building;
import buildings.Office;
import buildings.NoElectricityException;
import buildings.NoInternetException;
import providers.NoHoneyException;
import helpers.Silent;

public class C3W15 {
    public static final String NAME = " 15";
    public static void main(String[] args) throws Exception {
        Silent s = new Silent(5);
        Building b = new Office();
        b.connectElectricity(s);
        b.connectInternet(s);
        try {
            b.spend(1,5.5);
            System.out.println("WA" + NAME);
        } catch (NoHoneyException ex) {
            System.out.println("OK" + NAME);
        } catch (Exception ex) {
            System.out.println("WA" + NAME);
            throw ex;
        }
    }
}
