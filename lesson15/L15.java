import java.io.*;
import java.util.*;

interface ILight {
    boolean isOn();
    void turnOn();
    void turnOff();
}
class Candle implements ILight {
    boolean state;
    public boolean isOn() { return state; }
    public void turnOn() { state=true; }
    public void turnOff() { state=false; }
    public Candle(boolean state) {
        this.state = state;
    }
}
abstract class Lamp implements ILight {
    public abstract int getState();
    public abstract void setState(int state);

    public boolean isOn() { return getState()>0; }
    public void turnOn() { setState(100); }
    public void turnOff() { setState(0); }
}
class RGBLamp extends Lamp {
    int r,g,b;
    public RGBLamp(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public int getState() { return r+g+b; }
    public void setState(int state) {
        r = state/3;
        g = state/3;
        b = state/3;
    }
}
class WhiteLamp extends Lamp {
    int state;
    public int getState() { return state; }
    public void setState(int state) {
        this.state=state;
    }
}

public class L15 {
    public static void main(String[] args){
        ILight light1 = new WhiteLamp();
        ILight light2 = new Candle(true);
        ILight light3 = new RGBLamp(1,2,3);
        System.out.println(light1.isOn());
        System.out.println(light2.isOn());
        System.out.println(light3.isOn());
        Lamp l = new WhiteLamp();
        System.out.println(l);
        l = new RGBLamp(1,2,3);
        System.out.println(l);
    }
}
