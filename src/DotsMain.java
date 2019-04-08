import javax.swing.*;
import java.awt.*;

public class DotsMain {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Random Dots!");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 800;
        int height = 800;
        frame.setPreferredSize(new Dimension(width, height + 22));


        JPanel panel = new DotsPanel(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
