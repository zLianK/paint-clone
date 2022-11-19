import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

public class PaintDrawablePanel extends JPanel {

    private ColorPanel colorPanel;

    MouseMotionAdapter mmAdapter = new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            var point = new Point(e.getX(), e.getY(), colorPanel.getCurrentColor());
            point.paint(getGraphics());
        }
    };

    public PaintDrawablePanel(ColorPanel colorPanel) {
        this.colorPanel = colorPanel;
        addMouseMotionListener(mmAdapter);
    }
}
