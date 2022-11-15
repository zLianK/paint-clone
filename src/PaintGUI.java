import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class PaintGUI extends JFrame {

    private final int WIDTH = 800;
    private final int HEIGHT = 500;
    private final String TITLE = "Paint Clone";

    public void run() {
        setUp();
        setJMenuBar(createPaintMenuBar());
        add(createButtonsPanel(), BorderLayout.WEST);
        setVisible(true);
    }

    private void setUp() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle(TITLE);
    }

    private JMenuBar createPaintMenuBar() {
        var menuBar = new PaintMenuBar();
        return menuBar.createPaintMenuBar();
    }

    private JPanel createButtonsPanel() {
        var colorPanel = new ColorPanel();
        return colorPanel.createPanel();
    }
}
