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
        var colorPanel = new ColorPanel();
        add(colorPanel, BorderLayout.WEST);
        var paintFooter = new PaintFooter();
        add(paintFooter, BorderLayout.SOUTH);
        var drawablePanel = new PaintDrawablePanel(colorPanel, paintFooter);
        add(drawablePanel, BorderLayout.CENTER);
        var paintMenuBar = new PaintMenuBar(drawablePanel, paintFooter);
        setJMenuBar(paintMenuBar);
    }
}
