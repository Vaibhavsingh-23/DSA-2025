
import javax.swing.*;
import java.awt.*;

public class DrawRectangle extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Set the color for the rectangle
        g.setColor(Color.BLUE);
        // Draw a rectangle (x, y, width, height)
        g.drawRect(50, 50, 200, 100);
        // Fill a rectangle
        g.setColor(Color.RED);
        g.fillRect(70, 70, 160, 60);
    }

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Draw Rectangle Example");
        DrawRectangle panel = new DrawRectangle();

        // Set frame properties
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
