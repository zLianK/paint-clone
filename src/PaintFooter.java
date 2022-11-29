import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class PaintFooter extends JPanel {
    private JTextField textField;

    public PaintFooter() {
        setLayout(new GridLayout(1, 1));
        this.textField = new JTextField(PaintFooterMessage.SAVED_FILE);
        this.textField.setEditable(false);
        add(textField);
    }

    public JTextField getTextField() {
        return textField;
    }
}
