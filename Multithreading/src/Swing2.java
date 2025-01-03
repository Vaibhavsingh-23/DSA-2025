import  javax.swing.*;
import java.awt.*;
public class Swing2 extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(10,10,50,50);
    }

    public static void main(String[] args) {
        JFrame f= new JFrame();
        Swing2 s = new Swing2();
        f.add(s);
        f.setSize(500,400);
        f.setVisible(true);
    }
}
