import java.io.*;
import java.util.*;

interface ILight {
    boolean isOn();
}
class Candle implements ILight {
    boolean state;
    public boolean isOn() { return state; }
    public Candle(boolean state) {
        this.state = state;
    }
}
class Lamp implements ILight {
    int state;
    public boolean isOn() { return state>0; }
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
        System.out.println(light1.isOn());
        System.out.println(light2.isOn());
    }
}
