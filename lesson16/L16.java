import java.io.*;
import java.util.*;

class Lamp {
    public static final String NAME = "Lamp";
    public final String name;

    static int count;
    public static int getCount() {
        return count;
    }
    public static final String getName() {
        return NAME;
    }

    int serial;
    public int getSerial() { return serial; }
    public Lamp() {
        this.serial = count;
        name = "Lamp " + serial;
        count++;
    }
}

class RGBLamp extends Lamp {
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

        System.out.println(l1.name + " " +
                           l2.name + " " +
                           l3.name);

        System.out.println(l1.getSerial() +
                           " " + l1.getCount());
        System.out.println(Lamp.getCount());

        System.out.println(Lamp.getName());
        System.out.println(Lamp.NAME);

        System.out.println(Math.sin(1));

        OtherLamp o1 = OtherLampFactory.makeNewLamp();
        OtherLamp o2 = OtherLampFactory.makeNewLamp();
        OtherLamp o3 = OtherLampFactory.makeNewLamp();
    }
}
