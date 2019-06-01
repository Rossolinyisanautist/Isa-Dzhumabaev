import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Main extends JFrame {

    JPanel mainPanel;

    Main(){
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.DARK_GRAY);

        mainPanel.addMouseMotionListener(new MouseMotionAdapter() {
                 public void mouseMoved(MouseEvent e) {
                     setTitle("Lab05 Problem05: \n" + e.getX() + ", " + e.getY());
                 }
             }
        );
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
