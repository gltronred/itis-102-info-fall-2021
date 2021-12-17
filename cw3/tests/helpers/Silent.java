package helpers;

import providers.IElectricity;
import providers.INet;
import providers.NoHoneyException;

public class Silent implements IElectricity, INet {
    private int e;
    private double i;
    private int m;
    private int limit;
    public Silent(int limit) { this.limit=limit; e=0; i=0; m=0; }
    public int getE() { return e; }
    public double getI() { return i; }
    public int getM() { return m; }
    public void spendElectricity(int e) { this.e += e; }
    public void spendInternet(double i) throws NoHoneyException {
        if (this.i + i > this.limit)
            throw new NoHoneyException();
        if (this.e > 0) {
            this.i += i;
        }
    }
    public void pay(int m) {
        this.m += m;
    }
}
