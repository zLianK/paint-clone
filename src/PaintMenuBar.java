import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PaintMenuBar extends JMenuBar {
    public PaintMenuBar() {
        var menuFile = new JMenu("Arquivo");
        var saveItem = new JMenuItem("Salvar");
        menuFile.add(saveItem);
        add(menuFile);
    }
}
