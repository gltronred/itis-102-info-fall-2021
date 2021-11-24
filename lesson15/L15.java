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
class Lamp implements ILight {
    int state;
    public boolean isOn() { return state>0; }
    public void turnOn() { state=100; }
    public void turnOff() { state=0; }
    public Lamp(int state) {
        this.state = state;
    }
}
class RGBLamp extends Lamp {
    public RGBLamp(int state) { super(state); }
}

public class L15 {
    public static void main(String[] args){
        ILight light1 = new Lamp(255);
        ILight light2 = new Candle(true);
        ILight light3 = new RGBLamp(123);
        System.out.println(light1.isOn());
        System.out.println(light2.isOn());
        System.out.println(light3.isOn());
    }
}
