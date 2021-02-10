package CalcFrame.UI.UserControl;

import javax.swing.*;
import java.awt.*;

public class IconJPanel extends JPanel {
    private Image image;

    public IconJPanel(Image image) {
        if(image != null) {
            this.image = image;
            Dimension size = new Dimension(image.getWidth(null), image.getHeight(null));
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(image != null)
            g.drawImage(image, 0, 0, null);
    }
}
