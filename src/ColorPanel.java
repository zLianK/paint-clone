import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ColorPanel extends JPanel {

    private Color currentColor;

    ActionListener buttonColorListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            var button = (PaintButton) e.getSource();
            currentColor = button.getBackground();
        }
    };

    public ColorPanel() {
        currentColor = Color.BLACK;
        setLayout(new GridLayout(0, 1));
        var button = new PaintButton(Color.BLACK);
        button.addActionListener(buttonColorListener);
        add(button);
        button = new PaintButton(Color.BLUE);
        button.addActionListener(buttonColorListener);
        add(button);
        button = new PaintButton(Color.CYAN);
        button.addActionListener(buttonColorListener);
        add(button);
        button = new PaintButton(Color.GRAY);
        button.addActionListener(buttonColorListener);
        add(button);
        button = new PaintButton(Color.GREEN);
        button.addActionListener(buttonColorListener);
        add(button);
        button = new PaintButton(Color.LIGHT_GRAY);
        button.addActionListener(buttonColorListener);
        add(button);
        button = new PaintButton(Color.MAGENTA);
        button.addActionListener(buttonColorListener);
        add(button);
        button = new PaintButton(Color.ORANGE);
        button.addActionListener(buttonColorListener);
        add(button);
        button = new PaintButton(Color.PINK);
        button.addActionListener(buttonColorListener);
        add(button);
        button = new PaintButton(Color.RED);
        button.addActionListener(buttonColorListener);
        add(button);
        button = new PaintButton(Color.WHITE);
        button.addActionListener(buttonColorListener);
        add(button);
        button = new PaintButton(Color.YELLOW);
        button.addActionListener(buttonColorListener);
        add(button);
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }

    public Color getCurrentColor() {
        return currentColor;
    }
}
