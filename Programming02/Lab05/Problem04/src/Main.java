import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    Main(){
        JPanel mainPanel;
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);
        JPanel controlPanel = new JPanel();
        controlPanel.setBackground(new Color(90,90,90));

        JButton redButton = new JButton("RED");
        redButton.addActionListener(e -> mainPanel.setBackground(Color.RED));

        JButton greenButton = new JButton("GREEN");
        greenButton.addActionListener(e -> mainPanel.setBackground(Color.GREEN));

        JButton blueButton = new JButton("BLUE");
        blueButton.addActionListener(e -> mainPanel.setBackground(Color.BLUE));

        setLayout(new BorderLayout());
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
        frame.setVisible(true);
    }
}
