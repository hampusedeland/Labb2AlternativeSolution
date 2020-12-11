import java.awt.*;

public class Volvo240 extends Vehicle {

    public final static double trimFactor = 1.25;

    public Volvo240(int nrDoors, Color color, double enginePower, int weight){
        setNrDoors(nrDoors);
        setColor(color);
        setEnginePower(enginePower);
        setWeight(weight);
        setModelName("Volvo240");
    }

    @Override
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    public static Volvo240 createVolvo240(){
        Volvo240 volvis = new Volvo240(2,Color.black,240,1600);

        return volvis;
    }

}

