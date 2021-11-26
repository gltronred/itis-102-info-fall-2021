import java.io.*;
import java.util.*;

class Lamp {
    static int count;
    public static int getCount() {
        return count;
    }
    public static String getName() {
        return "Lamp";
    }

    int serial;
    public int getSerial() { return serial; }
    public Lamp() {
        this.serial = count;
        count++;
    }
}

class OtherLamp {
    int serial;
    public int getSerial() { return serial; }
}

class OtherLampFactory {
    public static int count;
    public static OtherLamp makeNewLamp() {
        OtherLamp lamp = new OtherLamp();
        lamp.serial = count;
        count++;
        return lamp;
    }
}

public class L16 {
    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        System.out.println(l1.getSerial() +
                           " " + l1.getCount());
        Lamp l2 = new Lamp();
        System.out.println(l2.getSerial() +
                           " " + l2.getCount());
        Lamp l3 = new Lamp();
        System.out.println(l3.getSerial() +
                           " " + l3.getCount());
        System.out.println(l1.getSerial() +
                           " " + l1.getCount());
        System.out.println(Lamp.getCount());
        System.out.println(Math.sin(1));
        OtherLamp o1 = OtherLampFactory.makeNewLamp();
        OtherLamp o2 = OtherLampFactory.makeNewLamp();
        OtherLamp o3 = OtherLampFactory.makeNewLamp();
    }
}
