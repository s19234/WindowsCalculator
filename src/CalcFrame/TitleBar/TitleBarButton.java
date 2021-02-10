package CalcFrame.TitleBar;

import CalcFrame.MainFrame;
import CalcFrame.Mode;
import org.jetbrains.annotations.NotNull;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TitleBarButton extends JButton {
    private final String text;
    private Color color;
    private final Mode mode;
    private final MainFrame frame;
    private final Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

    public TitleBarButton(String button, Color color, @NotNull MainFrame frame, Mode mode){
        this.text = button;
        this.mode = mode;
        this.frame = frame;
        this.color = color;
        d.height -= Toolkit.getDefaultToolkit().getScreenInsets(frame.getGraphicsConfiguration()).bottom;
        init();
    }

    private void init() {
        if(text != null) {
            this.setText(text);
        }
        else {
            this.setIcon(null);
        }
        this.setPreferredSize(new Dimension(60, 40));
        this.setFont(new Font("TimesNewRoman", Font.PLAIN, 20));
        this.setBackground(color);
        this.setOpaque(false);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        if(mode.equals(Mode.MINIMIZE)) {
            this.addActionListener(e -> frame.setExtendedState(Frame.ICONIFIED));
        } else if(mode.equals(Mode.MAXIMIZE)) {
            //this.setEnabled(false);
            this.addActionListener(e -> {
                frame.setLocation(0, 0);
                frame.setSize(d);
                frame.repaint();
            });
        } else if(mode.equals(Mode.CLOSE)) {
            this.addActionListener(e -> System.exit(0));
        }
        this.setVisible(true);
    }
}
