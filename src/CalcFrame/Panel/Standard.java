package CalcFrame.Panel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Standard extends JPanel {
    private JTextField textField;
    private String text;

    public Standard() {
        this.setLayout(new GridBagLayout());
        this.setSize(1280, 680);
        this.setLocation(0, 40);
        init();
    }

    private void init() {
        setUpTextField();

        this.add(textField,
                new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0,
                GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
                new Insets(50, 10, 0, 0 ), 0, 0));
    }

    private void setUpTextField() {
        this.textField = new JTextField() {
            @Override
            public void setBorder(Border border)
            {}
        };

        this.textField.setPreferredSize(new Dimension(800, 80));
        this.textField.setBackground(UIManager.getColor("Panel.background"));
        this.textField.setText("0");
        this.textField.setFont(new Font("TimesNewRoman", Font.PLAIN, 80));
        this.textField.setCaretColor(UIManager.getColor("Panel.background"));

        addActionToJTextField();
    }

    private void addActionToJTextField() {

    }
}
