import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class Point {
    private int x;
    private int y;
    private Color color;
    private int size = 10;

    public Point(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void paint(Graphics graphics) {
        var graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(color);
        graphics2D.fillOval(x, y, size, size);
    }
}
