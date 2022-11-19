import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PaintGUI extends JFrame {

    private final int WIDTH = 800;
    private final int HEIGHT = 500;
    private final String TITLE = "Paint Clone";

    public void run() {
        setUp();
        setComponents();
        setVisible(true);
    }

    private void setUp() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle(TITLE);
    }

    private void setComponents() {
        setJMenuBar(new PaintMenuBar());
        var colorPanel = new ColorPanel();
        add(colorPanel, BorderLayout.WEST);
        add(new PaintDrawablePanel(colorPanel), BorderLayout.CENTER);
    }
}
