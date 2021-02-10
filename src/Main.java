import CalcFrame.MainFrame;
import CalcFrame.UI.Theme.*;
import Functional.WindowFrameType;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        MainFrame mainFrame = new MainFrame(new GreyTheme(), "Calculator", WindowFrameType.NORMAL);
        mainFrame.setMinimumSize(new Dimension(600, 400));
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}

