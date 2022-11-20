import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Stack;

import javax.swing.JPanel;

public class PaintDrawablePanel extends JPanel {

    private ColorPanel colorPanel;
    private Stack<Point> inPoints = new Stack<>();

    MouseMotionAdapter mmAdapter = new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            var point = new Point(e.getX(), e.getY(), colorPanel.getCurrentColor());
            inPoints.push(point);
            point.paint(getGraphics());
        }
    };

    public PaintDrawablePanel(ColorPanel colorPanel) {
        this.colorPanel = colorPanel;
        addMouseMotionListener(mmAdapter);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        for (Point point : inPoints) {
            point.paint(graphics2D);
        }

    }
}
