import java.io.*;
import java.util.*;

class Candle {
    // задаётся длина свечи
    public Candle(int length) {}
    // зажечь и потушить
    public void turnOn() {}
    public void turnOff() {}
    // либо горит, либо нет
    // если горит, то длина уменьшается на 1
    // если длина стала 0 - то больше не горит
    public boolean getState() {}
    // можно зажечь от этой свечи другую
    // если эта горит
    // (и наоборот)
    public void turn(Candle other) {}
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

public class L14 {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp("lamp2");

        lamp1.turnOn();
        System.out.println(lamp1);
        System.out.println(lamp2);
        lamp1.setState(false);
        System.out.println(lamp1);
        lamp1.setState(true);
        System.out.println(lamp1);
        lamp1 = lamp2;
        System.out.println(lamp1);
        System.out.println(lamp2);
    }
}
