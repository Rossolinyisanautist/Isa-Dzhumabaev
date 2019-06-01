import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyButtonActionListener implements ActionListener{

    private JPanel panel;
    private Color color;

    MyButtonActionListener(JPanel panel, Color color){
        this.panel = panel;
        this.color = color;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        panel.setBackground(color);
    }
}

public class Main extends JFrame {

    Main(){
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);
        JPanel controlPanel = new JPanel();
        controlPanel.setBackground(new Color(90,90,90));

        JButton redButton = new JButton("RED");
        redButton.addActionListener(new MyButtonActionListener(mainPanel, Color.RED));

        JButton greenButton = new JButton("GREEN");
        greenButton.addActionListener(new MyButtonActionListener(mainPanel, Color.GREEN));

        JButton blueButton = new JButton("BLUE");
        blueButton.addActionListener(new MyButtonActionListener(mainPanel, Color.BLUE));

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
        frame.setVisible(true);
    }
}
