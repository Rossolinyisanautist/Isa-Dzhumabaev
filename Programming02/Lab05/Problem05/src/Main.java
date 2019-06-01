import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Main extends JFrame {

    JPanel mainPanel;

    class MyMouseMothinListner implements MouseMotionListener{

        public void mouseDragged(MouseEvent e) { /* . . . */ }

        public void mouseMoved(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();

            mainPanel.setBackground(new Color(x % 255, (x/y) % 255, y % 255));
            setTitle("Lab05 Problem05: \n" + e.getX() + ", " + e.getY());
        }
    }
    Main(){
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.DARK_GRAY);

        mainPanel.addMouseMotionListener(new MyMouseMothinListner());
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame frame = new Main();

        frame.setTitle("Lab05 Problem05");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
