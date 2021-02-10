package Functional;

import CalcFrame.MainFrame;
import CalcFrame.Mode;
import CalcFrame.Panel.Standard;
import CalcFrame.TitleBar.TitleBarButton;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Functional {

    public static void addHovering(@NotNull JButton button, Color color) {

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setOpaque(true);
                button.setContentAreaFilled(true);
                button.setBackground(color);
            }
        });
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                button.setOpaque(false);
                button.setFocusPainted(false);
                button.setContentAreaFilled(false);
            }
        });
    }

    @Contract("_, _, _, _, _ -> new")
    public static @NotNull TitleBarButton createButton(String text, Color color, MainFrame frame, Mode mode, Color whenHovered) {
        var button = new TitleBarButton(text, color, frame, mode);
        addHovering(button, whenHovered);
        return button;
    }


    public static @NotNull JTextField createTitleBarTitle(String text) {
        JTextField textField = new JTextField();
        textField.setText(text);
        textField.setSize(new Dimension(100, 20));
        textField.setEnabled(false);
        textField.setDisabledTextColor(Color.BLACK);
        textField.setBorder(null);
        textField.setBackground(UIManager.getColor("Panel.background"));
        return textField;
    }

    public static int countCharactersWithoutSpaces(@NotNull String tmp) {
        int value = 0;
        for(int i = 0; i < tmp.length(); i++) {
            if(tmp.charAt(i) != ' ')
                value++;
        }
        return value;
    }
}