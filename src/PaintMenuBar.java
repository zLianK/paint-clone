import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Optional;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PaintMenuBar extends JMenuBar {

    private final String EXTENSION_NAME = "jpg";
    private final String EXTENSION = ".".concat(EXTENSION_NAME);
    private PaintDrawablePanel drawablePanel;

    private ActionListener saveFileListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            var filePathOptional = openSaveDialog();
            if (!filePathOptional.isEmpty()) {
                saveFile(filePathOptional.get());
            }
        }
    };

    private ActionListener aboutListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            var textMessage = "Programação II";
            JOptionPane.showMessageDialog(null, textMessage, "Sobre", JOptionPane.INFORMATION_MESSAGE);
        }
    };

    private ActionListener exitListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    };

    public PaintMenuBar(PaintDrawablePanel drawablePanel) {
        this.drawablePanel = drawablePanel;
        add(createFileMenu());
        add(createHelpMenu());
    }

    private JMenu createFileMenu() {
        var menuFile = new JMenu("Arquivo");
        menuFile.add(createSaveItem());
        menuFile.add(createExitItem());
        return menuFile;
    }

    private JMenuItem createSaveItem() {
        var saveItem = new JMenuItem("Salvar");
        saveItem.addActionListener(saveFileListener);
        return saveItem;
    }

    private JMenuItem createExitItem() {
        var exitItem = new JMenuItem("Sair");
        exitItem.addActionListener(exitListener);
        return exitItem;
    }

    private JMenu createHelpMenu() {
        var helpMenu = new JMenu("Ajuda");
        helpMenu.add(createAboutItem());
        return helpMenu;
    }

    private JMenuItem createAboutItem() {
        var aboutItem = new JMenuItem("Sobre");
        aboutItem.addActionListener(aboutListener);
        return aboutItem;
    }

    private Optional<File> openSaveDialog() {
        var fileChooser = setUpFileChooser();
        fileChooser.showSaveDialog(null);
        Optional<File> filePathOptional;
        try {
            var file = fileChooser.getSelectedFile();
            var filePath = file.getAbsolutePath();
            if (!filePath.toLowerCase().endsWith(EXTENSION)) {
                file = new File(filePath.concat(EXTENSION));
            }
            filePathOptional = Optional.of(file);
        } catch (Exception e) {
            filePathOptional = Optional.empty();
        }
        return filePathOptional;
    }

    private JFileChooser setUpFileChooser() {
        var fileChooser = new JFileChooser();
        var filter = new FileNameExtensionFilter(EXTENSION_NAME.toUpperCase(), EXTENSION_NAME);
        fileChooser.setFileFilter(filter);
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setDialogTitle("Escolha o local para salvar");
        return fileChooser;
    }

    private void saveFile(File file) {
        var width = drawablePanel.getWidth();
        var height = drawablePanel.getHeight();
        var image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        var graphics = (Graphics2D) image.createGraphics();
        drawablePanel.printAll(graphics);
        try {
            ImageIO.write(image, EXTENSION_NAME, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
