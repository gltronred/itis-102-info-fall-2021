import humans.Account;
import humans.NegativeWithdrawalException;

public class C3W2 {
    public static final String NAME = " 2";
    public static void main(String[] args) throws Exception {
        Account acc = new Account(100);
        try {
            acc.withdraw(-1);
            System.out.println("WA" + NAME);
        } catch (NegativeWithdrawalException ex) {
            System.out.println("OK" + NAME);
        }
    }
}
