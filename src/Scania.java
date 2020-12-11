import java.awt.*;

public class Scania extends Truck {

    public Scania(int nrDoors, Color color, double enginePower, int weight) {
        setNrDoors(nrDoors);
        setColor(color);
        setEnginePower(enginePower);
        setWeight(weight);
        setModelName("Scania340");
    }

    public static Scania createScania(){
        Scania scanis= new Scania(2,Color.black,240,16000);

        return scanis;
    }
}
