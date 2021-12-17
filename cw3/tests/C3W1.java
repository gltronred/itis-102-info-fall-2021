import humans.*;
import buildings.*;
import providers.*;

public class C3W1 {
    public static void main(String[] args) throws Exception {
        Human alice = new Human(new Account(100), 100);
        Human bob = new Human(new Account(100), 50);

        Building flat = new Flat();
        flat.connectElectricity(new Nuclear());
        flat.connectInternet(new MobileNetwork("Orange", 100, 1));

        Building office = new Office();
        office.connectElectricity(new Nuclear());
        office.connectInternet(new MobileNetwork("Orange", 10, 10));
        office.connectInternet(new MobileNetwork("Telefonica", 100, 1));

        alice.use(flat, 1000, 99);
        System.out.println("Alice have: " + alice.getAccount().getAmount());
        alice.use(flat, 1000, 99);
        System.out.println("Alice have: " + alice.getAccount().getAmount());

        bob.use(office, 1000, 9);  // ok, используем первый провайдер
                                   // в первом провайдере остаётся 1 Gb
        bob.use(office, 5000, 98); // ok, используем второго провайдера
                                   // остаётся 1 и 2 Gb, соответственно
        bob.use(office, 500, 1);   // ok, используем первый провайдер,
                                   // осталось 0 и 2 Gb
        bob.use(office, 100, 2.5); // оплачиваем по 25 каждому провайдеру -
                                   // нигде нет больше 2.5 Gb
                                   // теперь остаётся 2.5 и 27 Gb
    }
}
