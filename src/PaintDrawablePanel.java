import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseAdapter;
import java.util.Stack;

import javax.swing.JPanel;

public class PaintDrawablePanel extends JPanel {

    private ColorPanel colorPanel;
    private PaintFooter paintFooter;
    private Point currentPoint;
    private Point previousPoint;
    private Stack<Point> inPoints = new Stack<>();

    MouseMotionAdapter mmAdapter = new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            currentPoint = new Point(e.getX(), e.getY(), colorPanel.getCurrentColor(), previousPoint);
            inPoints.push(currentPoint);
            currentPoint.paint(getGraphics());
            paintFooter.getTextField().setText(PaintFooterMessage.UNSAVED_FILE);
            previousPoint = currentPoint;
        }
    };

    MouseAdapter mAdapter = new MouseAdapter() {
        public void mouseReleased(MouseEvent e) {
            previousPoint = null;
        };
    };

    public PaintDrawablePanel(ColorPanel colorPanel, PaintFooter paintFooter) {
        this.colorPanel = colorPanel;
        this.paintFooter = paintFooter;
        addMouseMotionListener(mmAdapter);
        addMouseListener(mAdapter);
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
