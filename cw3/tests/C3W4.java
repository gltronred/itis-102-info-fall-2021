import humans.Account;
import humans.NoMoneyException;

public class C3W4 {
    public static final String NAME = " 4";
    public static void main(String[] args) throws Exception {
        Account acc = new Account(100);
        try {
            acc.withdraw(110);
            System.out.println("WA" + NAME);
        } catch (NoMoneyException ex) {
            if (ex.getAmount() == 100) {
                System.out.println("OK" + NAME);
            } else {
                System.out.println("WA" + NAME);
            }
        }
    }
}
