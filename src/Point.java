import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.BasicStroke;

public class Point {
    private int x;
    private int y;
    private Color color;
    private int size = 10;
    private Point previous = null;

    public Point(int x, int y, Color color, Point previous) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.previous = previous;
    }

    public void paint(Graphics graphics) {
        var graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(color);

        var stroke = new BasicStroke(size, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        graphics2D.setStroke(stroke);
        if (previous != null) {
            graphics2D.drawLine(
                    getX(),
                    getY(),
                    getPrevious().getX(),
                    getPrevious().getY());
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point getPrevious() {
        return previous;
    }
}
