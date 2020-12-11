import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SpeedViewer extends JFrame implements Observer{

    private static final int X = 400;
    private static final int Y = 400;
    DrawPanel2 drawPanel = new DrawPanel2(X,Y);
    CarModel model;
    JLabel carHolder = new JLabel();



    public SpeedViewer(String framename,CarModel carmodel){

        initComponents(framename);
        this.model=carmodel;

    }
    private void initComponents(String title){

        this.setTitle(title);
        this.setPreferredSize(new Dimension(X,Y));
        this.setLayout(new GridLayout());

        this.add(drawPanel);
        carHolder.setLayout(new GridLayout(1,1));




        this.add(carHolder);
        carHolder.setBackground(Color.CYAN);
        this.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width-this.getSize().width, dim.height-this.getSize().height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

     void updateSpedometer(){

        carHolder.setText(model.speedometer());

    }


    @Override
    public void update() {
        updateSpedometer();
    }
}
