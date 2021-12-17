import humans.Account;
import humans.NoMoneyException;

public class C3W3 {
    public static final String NAME = " 3";
    public static void main(String[] args) throws Exception {
        Account acc = new Account(100);
        acc.withdraw(90);
        if (acc.getAmount() != 10) {
            System.out.println("WA" + NAME);
        } else {
            System.out.println("OK" + NAME);
        }
    }
}
