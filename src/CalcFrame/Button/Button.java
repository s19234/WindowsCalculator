package CalcFrame.Button;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    private final Dimension size;
    private final String text;
    private final Point pos;
    private final Color color;

    public Button(String text, Dimension size, Point pos, Color color) {
        this.text = text;
        this.size = size;
        this.pos = pos;
        this.color = color;
        init();
    }

    public Button(String text, int width, int height, Point pos, Color color) {
        this(text, new Dimension(width, height), pos, color);
    }

    private void init() {
        this.setText(text);
        this.setSize(size);
        this.setBackground(color);
    }

    public Point getPos() {
        return pos;
    }
}
