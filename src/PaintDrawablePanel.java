import javax.swing.JPanel;
import java.awt.Color;

public class PaintDrawablePanel extends JPanel {

    private Color currentColor;

    public PaintDrawablePanel() {
        this.currentColor = Color.BLACK;
    }

    public void setCurrentColor(Color color) {
        this.currentColor = color;
    }

    public Color getCurrentColor() {
        return currentColor;
    }

}
