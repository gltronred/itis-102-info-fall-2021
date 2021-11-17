import java.io.*;
import java.util.*;

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
