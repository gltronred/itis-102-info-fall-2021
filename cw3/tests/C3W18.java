import humans.Human;
import humans.Account;
import buildings.Building;
import buildings.Office;
import buildings.NoElectricityException;
import buildings.NoInternetException;
import providers.NoHoneyException;
import helpers.Silent;
import helpers.SilentNet;

public class C3W18 {
    public static final String NAME = " 18";
    public static void main(String[] args) throws Exception {
        Human h = new Human(new Account(100), 21);
        Silent s = new Silent(5);
        SilentNet net1 = new SilentNet(5);
        Building b = new Office();
        b.connectElectricity(s);
        b.connectInternet(net1);
        try {
            h.use(b, 1, 15);
            if (net1.getM() == 21) {
                System.out.println("OK" + NAME);
            } else {
                System.out.println("WA" + NAME);
            }
        } catch (Exception ex) {
            System.out.println("WA" + NAME);
            throw ex;
        }
    }
}
