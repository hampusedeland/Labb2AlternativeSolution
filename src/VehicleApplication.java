import java.awt.*;

public class VehicleApplication {

    public static void main(String[] args) {

        CarModel carmod = new CarModel();

        CarView carvi = new CarView("frame",carmod);
        SpeedViewer spedvi = new SpeedViewer("speedframe",carmod);

        carmod.addObserver(spedvi);
        carmod.addObserver(carvi.drawPanel);
        CarController cc = new CarController(carmod);

        cc.startTimer();

    }
}
