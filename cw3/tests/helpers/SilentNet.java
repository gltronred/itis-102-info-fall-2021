package helpers;

import providers.INet;
import providers.NoHoneyException;

public class SilentNet implements INet {
    private double i;
    private int m;
    private int limit;
    public SilentNet(int limit) { this.limit=limit; i=0; m=0; }
    public double getI() { return i; }
    public int getM() { return m; }
    public void spendInternet(double i) throws NoHoneyException {
        if (this.i + i > this.limit)
            throw new NoHoneyException();
        this.i += i;
    }
    public void pay(int m) {
        this.m += m;
    }
}
