import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class PaintDrawablePanel extends JPanel {

    private Color currentColor;

    MouseMotionAdapter mmAdapter = new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            var point = new Point(e.getX(), e.getY(), currentColor);
            point.paint(getGraphics());
        }
    };

    public PaintDrawablePanel() {
        this.currentColor = Color.BLACK;
        addMouseMotionListener(mmAdapter);
    }

    public void setCurrentColor(Color color) {
        this.currentColor = color;
    }

    public Color getCurrentColor() {
        return currentColor;
    }

}
