import java.awt.*;

public class Dot {

    private int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw(Graphics2D g2) {
        g2.fillRect(x, y, 8, 8);
    }

    public Dot getMidpoint(Dot other) {
        int midX = (x + other.getX()) / 2;
        int midY = (y + other.getY()) / 2;
        Dot mid = new Dot(midX, midY);
        return mid;
    }

}
