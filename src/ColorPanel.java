import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class ColorPanel extends JPanel {
    public JPanel createPanel() {
        setLayout(new GridLayout(0, 1));
        var button = new PaintButton(Color.BLACK);
        add(button);
        button = new PaintButton(Color.BLUE);
        add(button);
        button = new PaintButton(Color.CYAN);
        add(button);
        button = new PaintButton(Color.GRAY);
        add(button);
        button = new PaintButton(Color.GREEN);
        add(button);
        button = new PaintButton(Color.LIGHT_GRAY);
        add(button);
        button = new PaintButton(Color.MAGENTA);
        add(button);
        button = new PaintButton(Color.ORANGE);
        add(button);
        button = new PaintButton(Color.PINK);
        add(button);
        button = new PaintButton(Color.RED);
        add(button);
        button = new PaintButton(Color.WHITE);
        add(button);
        button = new PaintButton(Color.YELLOW);
        add(button);
        return this;
    }
}
