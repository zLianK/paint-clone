import javax.swing.JFrame;

public class PaintGUI extends JFrame {

    private final int WIDTH = 800;
    private final int HEIGHT = 500;
    private final String TITLE = "Paint Clone";

    public void run() {
        setUp();
    }

    private void setUp() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle(TITLE);
        setVisible(true);
    }
}
