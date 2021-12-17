import buildings.Building;
import buildings.Office;
import buildings.NoElectricityException;
import buildings.NoInternetException;
import providers.NoHoneyException;
import helpers.Silent;
import helpers.SilentNet;

public class C3W16 {
    public static final String NAME = " 16";
    public static void main(String[] args) throws Exception {
        Silent s = new Silent(5);
        SilentNet s2 = new SilentNet(10);
        Building b = new Office();
        b.connectElectricity(s);
        b.connectInternet(s);
        b.connectInternet(s2);
        try {
            b.spend(1,5.5);
            if (s.getI() == 0 && s2.getI() == 5.5) {
                System.out.println("OK" + NAME);
            } else {
                System.out.println("WA" + NAME);
            }
        } catch (NoHoneyException ex) {
            System.out.println("WA" + NAME);
        } catch (Exception ex) {
            System.out.println("WA" + NAME);
            throw ex;
        }
    }
}
