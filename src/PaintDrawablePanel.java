import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Stack;

import javax.swing.JPanel;

public class PaintDrawablePanel extends JPanel {

    private ColorPanel colorPanel;
    private PaintFooter paintFooter;
    private Stack<Point> inPoints = new Stack<>();

    MouseMotionAdapter mmAdapter = new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            var point = new Point(e.getX(), e.getY(), colorPanel.getCurrentColor());
            inPoints.push(point);
            point.paint(getGraphics());
            paintFooter.getTextField().setText(PaintFooterMessage.UNSAVED_FILE);
        }
    };

    public PaintDrawablePanel(ColorPanel colorPanel, PaintFooter paintFooter) {
        this.colorPanel = colorPanel;
        this.paintFooter = paintFooter;
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
