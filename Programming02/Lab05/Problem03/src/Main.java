import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame {
    private JPanel mainPanel;

    class MyButtonActionListener implements ActionListener{

        private Color color;

        MyButtonActionListener(Color color){ this.color = color; }

        public void actionPerformed(ActionEvent e) { mainPanel.setBackground(color); }
    }

    Main(){
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);
        JPanel controlPanel = new JPanel();
        controlPanel.setBackground(new Color(90,90,90));

        JButton redButton = new JButton("RED");
        redButton.addActionListener(new MyButtonActionListener(Color.RED));

        JButton greenButton = new JButton("GREEN");
        greenButton.addActionListener(new MyButtonActionListener(Color.GREEN));

        JButton blueButton = new JButton("BLUE");
        blueButton.addActionListener(new MyButtonActionListener(Color.BLUE));

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
