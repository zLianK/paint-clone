import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
        PaintButton button;
        for (Color color : getAllColors()) {
            button = new PaintButton(color);
            button.addActionListener(buttonColorListener);
            add(button);
        }
    }

    private ArrayList<Color> getAllColors() {
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(Color.BLACK);
        colors.add(Color.BLUE);
        colors.add(Color.CYAN);
        colors.add(Color.GRAY);
        colors.add(Color.GREEN);
        colors.add(Color.LIGHT_GRAY);
        colors.add(Color.MAGENTA);
        colors.add(Color.ORANGE);
        colors.add(Color.PINK);
        colors.add(Color.RED);
        colors.add(Color.WHITE);
        colors.add(Color.YELLOW);
        return colors;
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }

    public Color getCurrentColor() {
        return currentColor;
    }
}
