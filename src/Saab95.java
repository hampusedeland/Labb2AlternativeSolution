import java.awt.*;

public class Saab95 extends Vehicle implements Turboable{

    private boolean turboOn;

    public Saab95(int nrDoors, Color color, double enginePower, int weight) { //ett problem va att man behövde deklarera flera ggr för resp konstruktor
        setNrDoors(nrDoors); //this.nrDoors = nrDoors;
        setColor(color);
        setEnginePower(enginePower);
        setWeight(weight);
        setModelName("Saab95");
        turboOn = false;

    }
    public static Saab95 createSaab95(){
        Saab95 saab95 = new Saab95(2,Color.black,300,1600);

        return saab95;
    }

    public void setTurboOn() { turboOn = true; }
    public void setTurboOff() {
        turboOn = false;
    }

    @Override
    public double speedFactor() {
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
}

