import java.io.*;
import java.util.*;

class Candle {
    boolean state;
    int length;

    // задаётся длина свечи
    public Candle(int length) {
        this.length = length;
    }

    // зажечь и потушить
    public void turnOn()  {
        if (length > 0) {
            state=true;
        }
    }
    public void turnOff() { state=false; }

    // либо горит, либо нет
    // если горит, то длина уменьшается на 1
    // если длина стала 0 - то больше не горит
    public boolean getState() {
        if (state) { length--; }
        if (length <= 0) { state=false; }
        return state;
    }

    // можно зажечь от этой свечи другую
    // если эта горит
    // (и наоборот)
    public void turn(Candle other) {
        this.state |= other.state;
        other.state |= this.state;
    }
}

class Lamp {
    boolean state;
    String name;

    public Lamp() {
        this.name = "Unknown";
    }
    public Lamp(String name) {
        this.name = name;
    }

    public void turnOn()  { state=true; }
    public void turnOff() { state=false; }
    public boolean getState() { return state; }
    public void setState(boolean s) {
        boolean state = s;
        this.state = state;
    }
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " -> " + state;
    }
}

class RGBLamp extends Lamp {
    int red;
    int green;
    int blue;

    public void setColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public int getRed() { return red; }
    public int getGreen() { return green; }
    public int getBlue() { return blue; }
}

public class L14 {
    public static void main(String[] args) {
        // Lamp lamp1 = new Lamp();
        // Lamp lamp2 = new Lamp("lamp2");

        // lamp1.turnOn();
        // System.out.println(lamp1);
        // System.out.println(lamp2);
        // lamp1.setState(false);
        // System.out.println(lamp1);
        // lamp1.setState(true);
        // System.out.println(lamp1);
        // lamp1 = lamp2;
        // System.out.println(lamp1);
        // System.out.println(lamp2);
        //
        // Candle c1 = new Candle(5);
        // c1.turnOn();
        // Candle c2 = new Candle(2);
        // c2.turnOn();
        // for (int i=0; i<2; i++) {
        //     System.out.println(c1 + " " + c1.getState());
        //     System.out.println(c2 + " " + c2.getState());
        // }
        // c2.turn(c1);
        // System.out.println(c2 + " " + c2.getState());
        // Candle c3 = new Candle(10);
        // c1.turn(c3);
        // System.out.println(c1 + " " + c1.getState());
        // System.out.println(c3 + " " + c3.getState());
        // c3.turnOff();
        // System.out.println(c3 + " " + c3.getState());

        Lamp l1 = new Lamp();
        RGBLamp l2 = new RGBLamp();

        l1.turnOn();
        l2.turnOn();
        l2.setColor(255,0,0);
        System.out.println(l2.getRed());
    }
}
