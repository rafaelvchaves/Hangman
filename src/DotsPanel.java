import javax.swing.*;
import java.awt.*;

/** 
 * created by Rafael Chaves
 */
public class DotsPanel extends JPanel {

    private Dot a, b, c;

    public DotsPanel(int width, int height) {
        setSize(width, height);

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        a = new Dot(getWidth() / 2, 0);
        b = new Dot(0, getHeight());
        c = new Dot(getWidth(), getHeight());
        Dot currentDot = new Dot(getWidth() / 2, getHeight() / 2);
        for (int i = 0; i < 10000; i++) {
            int picked = (int) (Math.random() * 3);
            if (picked == 0) {
                int Color1 = (int) (Math.random() * 256);
                int Color2 = (int) (Math.random() * 128);
                int Color3 = (int) (Math.random() * 128);
                g2.setColor(new Color(Color1, Color2, Color3));
                currentDot = currentDot.getMidpoint(a);
                currentDot.draw(g2);
            } else if (picked == 1) {
                int Color1 = (int) (Math.random() * 128);
                int Color2 = (int) (Math.random() * 256);
                int Color3 = (int) (Math.random() * 128);
                g2.setColor(new Color(Color1, Color2, Color3));
                currentDot = currentDot.getMidpoint(b);
                currentDot.draw(g2);
            } else if (picked == 2) {
                int Color1 = (int) (Math.random() * 128);
                int Color2 = (int) (Math.random() * 128);
                int Color3 = (int) (Math.random() * 256);
                g2.setColor(new Color(Color1, Color2, Color3));
                currentDot = currentDot.getMidpoint(c);
                currentDot.draw(g2);
            }
        }
    }
}
