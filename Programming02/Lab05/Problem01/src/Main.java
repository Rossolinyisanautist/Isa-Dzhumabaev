import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    Main(){
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);
        JPanel controlPanel = new JPanel();
        controlPanel.setBackground(new Color(90,90,90));

        JButton redButton = new JButton("RED");
        JButton greenButton = new JButton("GREEN");
        JButton blueButton = new JButton("BLUE");

        setLayout( new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
        controlPanel.add(redButton);
        controlPanel.add(greenButton);
        controlPanel.add(blueButton);
        add(controlPanel, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        JFrame frame = new Main();

        frame.setTitle("Lab05 Problem01");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        frame.add(main();)
        frame.setVisible(true);
    }
}
