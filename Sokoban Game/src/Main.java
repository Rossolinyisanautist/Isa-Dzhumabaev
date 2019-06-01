import GameErrors.*;

import javax.security.auth.kerberos.KerberosTicket;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main extends JFrame {

    class LevelPanel extends JPanel {

        Graphics g;
        Level level;
        private View levelView;
        private View playerView;
        private View boxView;


        LevelPanel(Level level) {
            this.level = level;
            levelView = new LevelSwingView(level);
            playerView = new PlayerSwingView(level);
            boxView = new BoxSwingView(level);
            Color groundColor = new Color(101, 159, 62);
            setBackground(groundColor);
//            addKeyListener(myKeyListener);
            repaint();
        }

        void changeLevel(Level level) {
            this.level = level;
            levelView = new LevelSwingView(level);
            playerView = new PlayerSwingView(level);
            boxView = new BoxSwingView(level);
            repaint();
        }

        void resetLevel() {
            // TODO: Implement this
            level.reset();
            levelPanel.repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            this.g = g;
            levelView.present(g, getWidth(), getHeight());
            playerView.present(g, getWidth(), getHeight());
            boxView.present(g, getWidth(), getHeight());
        }
    }


    class ToolBarPanel extends JPanel {

        class MyButton extends JButton {

            MyButton(String name) {
                super(name);
                setPreferredSize(new Dimension(150, 50));
                setFocusable(false);
            }
        }

        class InformationPanel extends JPanel{

            String information;
            InformationPanel(String infoToShow){
                this.information = infoToShow;
                setLayout(new BorderLayout());
                setPreferredSize(new Dimension(150, 50));
                setBackground(Color.CYAN);

                JLabel label = new JLabel(information);
                add(label, BorderLayout.LINE_START);

                setFocusable(false);
            }
        }


        ToolBarPanel() {
            super(new GridBagLayout());

            Color toolPanelColor = new Color(91, 149, 52);
            setBackground(toolPanelColor);

            // TODO: Add buttons to ToolBar Panel
            JButton prev = new MyButton("<<");
            JButton next = new MyButton(">>");
            JButton reset = new MyButton("Reset(ESC)");
            JButton undo = new MyButton("Undo(PgUp)");
            JButton redo = new MyButton("Redo(PgDn)");

            JPanel puzzleNumber = new InformationPanel(levels.get(levelID).getName().split(" ")[0]);
            JPanel move = new InformationPanel("Moves");

            // TODO: Determine actions for buttons on ToolBar Panel
            prev.addActionListener(e -> {
                levelID--;
                if (levelID < 0) {
                    levelID = levels.size() - 1;
                }

                levelPanel.resetLevel();

                Level level = levels.get(levelID);
                levelPanel.changeLevel(level);
            });

            next.addActionListener(e -> {
                levelID++;
                if (levelID == levels.size()) {
                    levelID = 0;
                }

                levelPanel.resetLevel();

                Level level = levels.get(levelID);
                levelPanel.changeLevel(level);
            });

            reset.addActionListener(e -> levelPanel.resetLevel());

            undo.addActionListener(undoListener);

            redo.addActionListener(redoListener);

            // TODO: Arrange Buttons on the right side of window
            GridBagConstraints c = new GridBagConstraints();
            c.insets = new Insets(15, 10, 15, 10);

            c.gridy = 0;
            add(puzzleNumber, c);
            c.gridy = 1;
            add(prev, c);
            c.gridy = 2;
            add(next, c);
            c.gridy = 3;
            add(move, c);
            c.gridy = 4;
            add(reset, c);
            c.gridy = 5;
            add(undo, c);
            c.gridy = 6;
            add(redo, c);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
//            g.drawString(Integer.toString(count), 5, 5);
        }
    }
    UndoButtonActionListener undoListener = new UndoButtonActionListener();
    RedoButtonActionListener redoListener = new RedoButtonActionListener();

    class UndoButtonActionListener implements ActionListener {
        private ActionEvent e;
        void performAction(){
            actionPerformed(e);
        }
        @Override
        public void actionPerformed(ActionEvent e) {

            this.e = e;
            Level currentLevel = levels.get(levelID);
            ArrayList<Point> playerToUndo = currentLevel.getPlayerToUndo();
            ArrayList<Point> playerToRedo = currentLevel.getPlayerToRedo();

            ArrayList<Integer> directionToUndo = currentLevel.getDirectionToUndo();
            ArrayList<Integer> directionToRedo = currentLevel.getDirectionToRedo();

            ArrayList<Point>[] boxesToUndo = currentLevel.getBoxesToUndo();
            ArrayList<Point>[] boxesToRedo = currentLevel.getBoxesToRedo();

            if (playerToUndo.size() <= 1) {
                JOptionPane.showMessageDialog(null, "Nothing to undo");
                return;
            }

            // TODO: Undo player's moves and directions
            int lastState = playerToUndo.size() - 1;

            playerToRedo.add(playerToUndo.get(lastState));
            directionToRedo.add(directionToUndo.get(lastState));

            playerToUndo.remove(lastState);
            directionToUndo.remove(lastState);

            Point prevPoint = playerToUndo.get(lastState - 1);
            currentLevel.getPlayer().moveTo(prevPoint, directionToUndo.get(lastState - 1));

            // TODO: Undo boxes' moves
            for (int i = 0; i < boxesToUndo.length; i++) {
                ArrayList<Point> boxToUndo = boxesToUndo[i];
                ArrayList<Point> boxToRedo = boxesToRedo[i];

                lastState = boxToUndo.size() - 1;

                boxToRedo.add(boxToUndo.get(lastState));
                boxToUndo.remove(lastState);

                prevPoint = boxToUndo.get(boxToUndo.size() - 1);

                currentLevel.getBoxes().get(i).moveBackTo(prevPoint);
                currentLevel.getBoxes().get(i).checkIfInstalled(currentLevel.getGoals());

            }

            levelPanel.repaint();
        }
    }

    class RedoButtonActionListener implements ActionListener {
        private ActionEvent e;
        void performAction(){
            actionPerformed(e);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            this.e = e;
            Level currentLevel = levels.get(levelID);
            ArrayList<Point> playerToUndo = currentLevel.getPlayerToUndo();
            ArrayList<Point> playerToRedo = currentLevel.getPlayerToRedo();

            ArrayList<Integer> directionToUndo = currentLevel.getDirectionToUndo();
            ArrayList<Integer> directionToRedo = currentLevel.getDirectionToRedo();

            ArrayList<Point>[] boxesToUndo = currentLevel.getBoxesToUndo();
            ArrayList<Point>[] boxesToRedo = currentLevel.getBoxesToRedo();

            if (playerToRedo.size() == 0) {
                JOptionPane.showMessageDialog(null, "Nothing to Redo");
                return;
            }

            // TODO: Redo player's moves and directions
            int lastState = playerToRedo.size() - 1;

            playerToUndo.add(playerToRedo.get(lastState));
            directionToUndo.add(directionToRedo.get(lastState));

            playerToRedo.remove(lastState);
            directionToRedo.remove(lastState);

            lastState = playerToUndo.size() - 1;

            Point nextPoint = playerToUndo.get(lastState);
            currentLevel.getPlayer().moveTo(nextPoint, directionToUndo.get(lastState));

            // TODO: Redo boxes' moves
            for (int i = 0; i < boxesToUndo.length; i++) {

                ArrayList<Point> boxToUndo = boxesToUndo[i];
                ArrayList<Point> boxToRedo = boxesToRedo[i];

                lastState = boxToRedo.size() - 1;

                boxToUndo.add(boxToRedo.get(lastState));
                boxToRedo.remove(lastState);

                nextPoint = boxToUndo.get(boxToUndo.size() - 1);

                currentLevel.getBoxes().get(i).moveBackTo(nextPoint);
                currentLevel.getBoxes().get(i).checkIfInstalled(currentLevel.getGoals());
            }
            levelPanel.repaint();
        }
    }


    class MyJComboBox<T> extends JComboBox<T> {
        MyJComboBox() {
            setPreferredSize(new Dimension(250, 25));
            setFocusable(false);
        }
    }

    class LevelSelectionPanel extends JPanel {

        LevelSelectionPanel(ArrayList<String> fileNames) throws NullPointerException {
            setFocusable(false);

            Color toolPanelColor = new Color(91, 149, 52);
            setBackground(toolPanelColor);

            JComboBox<String> levelPackSelector = new MyJComboBox<>();

            for (int i = 0; i < fileNames.size(); i++) {
                String stringItem = fileNames.get(i).replace(".txt", "");
                levelPackSelector.addItem(stringItem);
            }

            levelPackSelector.addItemListener(e -> {
                try {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        changeLevelPack(levelPackSelector.getSelectedItem().toString());
                    }
                }
                catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error 1", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } catch (BoxInitializationException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error 2", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } catch (InvalidSymbolException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Level representation error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } catch (LevelDataCorruptedException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error 3", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } catch (IndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(null, "Folder with levels is empty\n\nTry to reinstall the game", "Error 4", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } catch (GameFilesCorruptedException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error 5", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            });

            add(levelPackSelector);
        }
    }


    private int levelID = 0;
    private LevelPanel levelPanel;
    private JPanel toolBarPanel;
    private JPanel levelSelectionPanel;
    private static ArrayList<Level> levels;
    private static ArrayList<String> fileNames;

    Main() {
        Level level = this.levels.get(levelID);
        levelPanel = new LevelPanel(level);
        start();
    }





    class MyKeyListener extends KeyAdapter{
        // TODO: Game Logic. Implement KeyListener
        // TODO: Do not save states where no actions were allowed

            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                Level level = levels.get(levelID);
                System.out.println(level);
                Player player = level.getPlayer();
                System.out.println(level.getPlayer());
                ArrayList<Point> playerToUndo = level.getPlayerToUndo();
                ArrayList<Integer> directionToUndo = level.getDirectionToUndo();
                ArrayList<Point>[] boxesToUndo = level.getBoxesToUndo();

                ArrayList<Point> walls = level.getWalls();
                ArrayList<Point> goals = level.getGoals();
                ArrayList<Box> boxes = level.getBoxes();

                // TODO: Save starting states of all objects
                if (playerToUndo.size() == 0) {

                    playerToUndo.add(new Point(player.getX(), player.getY()));
                    directionToUndo.add(player.getDirection());

                    for (int i = 0; i < boxes.size(); i++) {

                        Box box = boxes.get(i);
                        boxesToUndo[i].add(new Point(box.getX(), box.getY()));
                    }
                }
                // TODO: Implement player control
                player.StartMoving(walls);

                // TODO: Save current to return to it in case of collision with other objects
                int prevPlayerX = player.getX();
                int prevPlayerY = player.getY();
                int prevDirection = player.getDirection();

                if ( e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_UP ||
                     e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT) {

                    System.out.println("KEY");

                    switch (e.getKeyCode()) {

                        case KeyEvent.VK_LEFT:
                            player.moveLeft();
                            break;

                        case KeyEvent.VK_UP:
                            player.moveUp();
                            break;

                        case KeyEvent.VK_RIGHT:
                            player.moveRight();
                            break;

                        case KeyEvent.VK_DOWN:
                            player.moveDown();
                            break;
                    }

                    // TODO: Save points of objects
                    playerToUndo.add(new Point(player.getX(), player.getY()));
                    directionToUndo.add(player.getDirection());

                    for (int i = 0; i < boxes.size(); i++) {
                        Box box = boxes.get(i);
                        boxesToUndo[i].add(new Point(box.getX(), box.getY()));
                    }
                } else {
                    switch (e.getKeyCode()) {

                        case KeyEvent.VK_ESCAPE:
                            levelPanel.resetLevel();
                            break;

                        case KeyEvent.VK_PAGE_UP:
                            // TODO: Implement Undo
                            new UndoButtonActionListener().performAction();
                            break;

                        case KeyEvent.VK_PAGE_DOWN:
                            // TODO: Implement Redo
                            new RedoButtonActionListener().performAction();
                            break;
                    }
                }

                // TODO: Check if any box was moved by player
                for (int i = 0; i < boxes.size(); i++) {
                    Box box = boxes.get(i);

                    if (box.getX() == player.getX() && box.getY() == player.getY()) {
                        box.move(player.getDirection(), walls, boxes);

                        // TODO: Rewrite its position in history if box was moved
                        int lastPoint = boxesToUndo[0].size() - 1;

                        boxesToUndo[i].get(lastPoint).x = box.getX();
                        boxesToUndo[i].get(lastPoint).y = box.getY();

                        // TODO: Check if box is in storage
                        for (int j = 0; j < goals.size(); j++) {
                            box = boxes.get(i);
                            Point goal = goals.get(j);

                            if (box.getX() == goal.x && box.getY() == goal.y) {
                                box.setInstalled(true);
                                break;
                            }

                            box.setInstalled(false);
                        }
                    }
                }

                //  TODO: If box was not moved because of wall or another box, reset player position to its prev. position.
                for (int i = 0; i < boxes.size(); i++) {
                    Box box = boxes.get(i);

                    if (box.getY() == player.getY() && box.getX() == player.getX()) {
                        Point prevPoint = new Point(prevPlayerX, prevPlayerY);
                        int lastPoint = playerToUndo.size() - 1;

                        player.moveTo(prevPoint, prevDirection);

                        playerToUndo.get(lastPoint).x = prevPlayerX;
                        playerToUndo.get(lastPoint).y = prevPlayerY;

                        directionToUndo.set(lastPoint, prevDirection);
                    }
                }
                // TODO: Check if puzzle is solved. If it is load next level
                levelPanel.repaint();

                if (level.isSolvedMethod()) {
                    levelID++;

                    String message = "You solved puzzle " + (levelID) + " Moves: " + (level.getPlayerToUndo().size() - 1);
                    JOptionPane.showMessageDialog(null, message);

                    // Reset solved level
                    level.reset();

                    levelID %= levels.size();
                    level = levels.get(levelID);

                    levelPanel.changeLevel(level);
                }
            }
        }



    void changeLevelPack(String levelPackName) throws GameFilesCorruptedException,
                                                      BoxInitializationException,
                                                      InvalidSymbolException,
                                                      LevelDataCorruptedException
    {
        remove(levelPanel);
        remove(toolBarPanel);
        remove(levelSelectionPanel);
        levelID = 0;
        levels = Utils.loadLevels("levels\\" + levelPackName + ".txt", levelPackName);
        levelPanel = new LevelPanel(levels.get(0));
        setupFrame(this);
        start();
        levelPanel.grabFocus();
        repaint();

    }


    //    private static ArrayList<String> fileNames ;

    void setupFrame(Main frame){

//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(1201, 800);
        frame.setSize(1200, 800);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Project 2. Sokoban Game.");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    void start() {

        setLayout(new BorderLayout());

        levelPanel.setFocusable(true);
        levelPanel.grabFocus();

        levelSelectionPanel = new LevelSelectionPanel(fileNames);
        toolBarPanel        = new ToolBarPanel();

        add(levelPanel, BorderLayout.CENTER);
        add(levelSelectionPanel, BorderLayout.NORTH);
        add(toolBarPanel, BorderLayout.EAST);

        KeyListener myKeyListener = new MyKeyListener();

        levelPanel.addKeyListener(myKeyListener);
    }

    public static void main(String[] ags) {

        try {
            File folder = new File("levels");

            fileNames = new ArrayList<>();

            String[] tempList = folder.list();

            for (int i = 0; i < tempList.length; i++) {
                if (tempList[i].endsWith(".txt")) {
                    fileNames.add(tempList[i]);
                }
            }

            String levelToLoad = fileNames.get(fileNames.size() - 1);
            String path = "levels\\".concat(levelToLoad);

            Main.levels = Utils.loadLevels(path, levelToLoad.replace(".txt", ""));

            Main frame = new Main();

            frame.setupFrame(frame);


        } catch (LevelFileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error 1", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (BoxInitializationException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error 2", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (InvalidSymbolException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Level representation error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (LevelDataCorruptedException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error 3", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Folder with levels is empty\n\nTry to reinstall the game", "Error 4", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }catch (GameFilesCorruptedException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error 6", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}

