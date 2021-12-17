import humans.Human;
import humans.Account;
import humans.NoMoneyException;
import buildings.Building;
import buildings.Office;
import buildings.NoElectricityException;
import buildings.NoInternetException;
import helpers.Silent;
import helpers.SilentNet;

public class C3W20 {
    public static final String NAME = " 20";
    public static void main(String[] args) throws Exception {
        Human h = new Human(new Account(20), 21);
        Silent s = new Silent(5);
        SilentNet net1 = new SilentNet(5);
        SilentNet net2 = new SilentNet(10);
        Building b = new Office();
        b.connectElectricity(s);
        b.connectInternet(net1);
        b.connectInternet(net2);
        try {
            h.use(b, 1, 15);
            System.out.println("WA" + NAME);
        } catch (NoMoneyException ex) {
            System.out.println("OK" + NAME);
        } catch (Exception ex) {
            System.out.println("WA" + NAME);
            throw ex;
        }
    }
}
