import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintGUI extends JFrame {

    private final int WIDTH = 800;
    private final int HEIGHT = 500;
    private final String TITLE = "Paint Clone";

    public void run() {
        setUp();
        add(createButtonsPanel(), BorderLayout.WEST);
        setVisible(true);
    }

    private void setUp() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle(TITLE);
    }

    private JPanel createButtonsPanel() {
        var buttonsPanel = new JPanel(new GridLayout(0, 1));
        var button = new PaintButton(Color.BLACK);
        buttonsPanel.add(button);
        button = new PaintButton(Color.BLUE);
        buttonsPanel.add(button);
        button = new PaintButton(Color.CYAN);
        buttonsPanel.add(button);
        button = new PaintButton(Color.GRAY);
        buttonsPanel.add(button);
        button = new PaintButton(Color.GREEN);
        buttonsPanel.add(button);
        button = new PaintButton(Color.LIGHT_GRAY);
        buttonsPanel.add(button);
        button = new PaintButton(Color.MAGENTA);
        buttonsPanel.add(button);
        button = new PaintButton(Color.ORANGE);
        buttonsPanel.add(button);
        button = new PaintButton(Color.PINK);
        buttonsPanel.add(button);
        button = new PaintButton(Color.RED);
        buttonsPanel.add(button);
        button = new PaintButton(Color.WHITE);
        buttonsPanel.add(button);
        button = new PaintButton(Color.YELLOW);
        buttonsPanel.add(button);
        return buttonsPanel;
    }
}
