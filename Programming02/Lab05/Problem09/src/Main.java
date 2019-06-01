import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Main extends JFrame {

    Robot robot = new Robot();
    ArrayList<Box> boxes;
    ArrayList<Point> points;
    Main.MyPanel mainPanel = new Main.MyPanel();

    class MyPanel extends JPanel{

        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            int cellSizeX = getWidth() / 8;
            int cellSizeY =  getHeight() / 8;
            for(int x = 0; x < 8; x++){
                for(int y = 0; y < 8; y++) {
                    g.setColor(x % 2 == 0 ? (y % 2 == 0 ? Color.WHITE : Color.BLACK)
                            : (y % 2 == 0 ? Color.BLACK : Color.WHITE));
                    g.fillRect( cellSizeX * x, cellSizeY * y, cellSizeX, cellSizeY);
                }
            }
            g.setColor(Color.ORANGE);
            for(int i = 0; i < points.size(); i++){
                Point point = points.get(i);
                g.fillOval( (int)((cellSizeX * point.x) + cellSizeX * 0.5f / 2),
                        (int) ((cellSizeY * point.y) + cellSizeX * 0.5f / 2),
                        (int)(cellSizeX - cellSizeX * 0.5f),
                        (int)(cellSizeY - cellSizeY * 0.5f));
            }

            g.setColor(Color.RED);
            g.fillOval(cellSizeX * robot.x, cellSizeY * robot.y, cellSizeX, cellSizeY);

            for(int i = 0; i < boxes.size(); i++){
                Box box = boxes.get(i);
                g.setColor(box.isInstalled ? Color.GREEN : Color.CYAN);
                g.fillRect(cellSizeX * boxes.get(i).x, cellSizeY * boxes.get(i).y, cellSizeX, cellSizeY);
            }
        }
    }

    Main(){
        boxes = new ArrayList<>();
        points = new ArrayList<>();
        boxes.add(new Box(4, 4));
        boxes.add(new Box(6, 1));
        boxes.add(new Box(1, 6));
        points.add(new Point(0, 1));
        points.add(new Point(3, 7));
        points.add(new Point(6, 2));
        mainPanel.setFocusable(true);
        add(mainPanel);

        mainPanel.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    int prevRobotX = robot.x;
                    int prevRobotY = robot.y;
                    if (e.getKeyCode() == 37) {
                        robot.left();
                    } else if (e.getKeyCode() == 38) {
                        robot.up();
                    } else if (e.getKeyCode() == 39) {
                        robot.rigth();
                    } else if (e.getKeyCode() == 40) {
                        robot.down();
                    }
                    for(int i = 0; i < boxes.size(); i++){
                        Box box = boxes.get(i);
                        int prevBoxX = box.x;
                        int prevBoxY = box.y;
                        if(robot.x == box.x && robot.y == box.y){
                            box.move(robot.direction);
                            for(int j = 0; j < boxes.size(); j++){
                                Box otherBox = boxes.get(j);
                                if(i != j){
                                    if(otherBox.x == box.x && otherBox.y == box.y){
                                        box.x = prevBoxX;
                                        box.y = prevBoxY;
                                        robot.x = prevRobotX;
                                        robot.y = prevRobotY;
                                    }
                                }
                                Point point = points.get(j);

                                if(point.x == box.x && point.y == box.y){
                                    box.isInstalled = true;
                                    break;
                                }
                                box.isInstalled = false;
                            }
                        }
                    }
                    mainPanel.repaint();

                    // check if level is solved and game is finished
                    boolean isSolved = true;
                    for(int i = 0; i < boxes.size(); i++){
                        Box box = boxes.get(i);
                        if(!box.isInstalled){
                            isSolved = false;
                            break;
                        }
                    }
                    if(isSolved){
                        JOptionPane.showMessageDialog(null, "You solved the puzzle");
                        System.exit(0);
                    }
                }
            }
        );
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