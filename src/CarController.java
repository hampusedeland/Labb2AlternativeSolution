import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarController {



    private final int delay = 50;
    private Timer timer = new Timer(delay, new TimerListener());
    private CarModel carmodel;


    public CarController(CarModel carmod){
        this.carmodel=carmod;

    }


    public void startTimer(){
        timer.start();
    }



    public class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            carmodel.move();
        }
    }















}
