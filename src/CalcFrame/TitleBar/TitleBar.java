//package CalcFrame.TitleBar;
//
//import CalcFrame.MainFrame;
//import CalcFrame.Mode;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionAdapter;
//
//import static Functional.Functional.createButton;
//import static Functional.Functional.createTitleBarTitle;
//
//public class TitleBar extends JPanel {
//    private Point initialClick;
//    private final MainFrame frame;
//
//    public TitleBar(final MainFrame frame) {
//        this.frame = frame;
//        this.setSize(new Dimension(1280, 40));
//        this.setLocation(0, 0);
//        this.setLayout(new GridBagLayout());
//        init();
//
//        addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//                initialClick = e.getPoint();
//                getComponentAt(initialClick);
//            }
//        });
//
//        addMouseMotionListener(new MouseMotionAdapter(){
//            @Override
//            public void mouseDragged(MouseEvent e) {
//                int thisX = frame.getLocation().x;
//                int thisY = frame.getLocation().y;
//                int xMoved = e.getX() - initialClick.x;
//                int yMoved = e.getY() - initialClick.y;
//
//                int X = thisX + xMoved;
//                int Y = thisY + yMoved;
//                frame.setLocation(X, Y);
//            }
//        });
//    }
//
//    private void init() {
//        this.add(createTitleBarTitle("Calculator"),
//                new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0,
//                        GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
//                        new Insets(5, 10, 0, 0), 0, 0));
//
//        this.add(createButton("-", Color.GRAY, frame, Mode.MINIMIZE, Color.DARK_GRAY),
//                new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0,
//                        GridBagConstraints.NORTHEAST, GridBagConstraints.NONE,
//                        new Insets(0, 0, 0, 120), 0, 0));
//        this.add(createButton("[]", Color.GRAY, frame, Mode.MAXIMIZE, Color.DARK_GRAY),
//                new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0,
//                        GridBagConstraints.NORTHEAST, GridBagConstraints.NONE,
//                        new Insets(0, 0, 0, 60), 0, 0));
//        this.add(createButton("x", Color.GRAY, frame, Mode.CLOSE, Color.RED),
//                new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0,
//                        GridBagConstraints.NORTHEAST, GridBagConstraints.NONE,
//                        new Insets(0, 0, 0, 0), 0, 0));
//    }
//}
