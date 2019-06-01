import GameErrors.BoxInitializationException;
import GameErrors.GameFilesCorruptedException;
import GameErrors.InvalidSymbolException;
import GameErrors.LevelDataCorruptedException;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Level {

    final static char FLOOR_CHAR    = ' ';
    final static char WALL_CHAR     = '#';
    final static char PLAYER_CHAR   = '@';
    final static char PLAYER_ON_STORAGE_CHAR   = '+';
    final static char BOX_CHAR      = '$';
    final static char STORAGE_CHAR  = '.';
    final static char BOX_IN_STORAGE_CHAR  = '*';

    private ArrayList<Box> boxes;
    private ArrayList<Point>[] boxesToUndo;
    private ArrayList<Point>[] boxesToRedo;

    private Player player;
    private ArrayList<Point> playerToUndo;
    private ArrayList<Point> playerToRedo;
    private ArrayList<Integer> directionToUndo;
    private ArrayList<Integer> directionToRedo;

    private ArrayList<Point> walls;
    private ArrayList<Point> goals;
    private char[][] dataToDraw;  //

    private String name;            // TODO: Show on ToolBar Panel
    private int bestRecord;      // TODO: Show on ToolBar Panel

    Level(String name, Player player, ArrayList<Box> boxes, ArrayList<Point> walls, ArrayList<Point> goals, char[][] dataToDraw){
        this.name = name;
        this.player = player;
        this.boxes = boxes;
        this.walls = walls;
        this.goals = goals;
        this.dataToDraw = dataToDraw;
        playerToUndo = new ArrayList<>();
        playerToRedo = new ArrayList<>();
        directionToUndo = new ArrayList<>();
        directionToRedo = new ArrayList<>();

        boxesToUndo = new ArrayList[boxes.size()];
        boxesToRedo = new ArrayList[boxes.size()];
        for(int i = 0; i < boxesToUndo.length; i++){
            boxesToUndo[i] = new ArrayList<>();
            boxesToRedo[i] = new ArrayList<>();
        }
    }

    void reset(){
        player.reset();
        playerToUndo.clear();
        playerToRedo.clear();

        directionToUndo.clear();
        directionToRedo.clear();

        for(int i = 0; i < boxes.size(); i++){
            boxes.get(i).reset(goals);
            boxesToUndo[i].clear();
            boxesToRedo[i].clear();
        }
    }

    void setName(String name){
        this.name = name;
    }

    static Level parseLevel(String level, String name) throws InvalidSymbolException,
                                                 LevelDataCorruptedException,
                                                 BoxInitializationException,
                                                 GameFilesCorruptedException
    {

        // TODO: Add parsing error checks. Use exceptions.

        String[] parts = level.split(";"); //TODO: error checking

        if(parts.length == 0 || parts.length == 1){
            throw new LevelDataCorruptedException();
        }

              level   = parts[0];
//        String name   = parts[1].trim();           // TODO: error checking
//               name   = name.charAt(0) + name.substring(1).toLowerCase();
        String[] rows = level.split("\n");

        int height = rows.length;
        int width = rows[0].length();

        for(int i = 1; i < rows.length; i++){
            if(rows[i].length() > width){
                width = rows[i].length();
            }
        }

        Player player           = null;
        ArrayList<Box> boxes    = new ArrayList<>();
        ArrayList<Point> walls  = new ArrayList<>();
        ArrayList<Point> goals  = new ArrayList<>();

        char[][] data = new char[height][width];
        int storagePlaces = 0;  // TODO: Use it for error checking

        for(int y = 0; y < height; y++){
            String row = rows[y];
            int x;

            for(x = 0; x < row.length(); x++){

                char element = row.charAt(x);

                switch (element){

                    case FLOOR_CHAR:
                        data[y][x] = element;
                        break;

                    case WALL_CHAR:
                        data[y][x] = element;
                        walls.add(new Point(x, y));
                        break;

                    case STORAGE_CHAR:
                        data[y][x] = element;
                        goals.add(new Point(x, y));
                        storagePlaces++;
                        break;

                    case PLAYER_CHAR:
                        player = new Player(x, y);
                        data[y][x] = FLOOR_CHAR;
                        break;

                    case BOX_CHAR:
                        boxes.add(new Box(x, y));
                        data[y][x] = FLOOR_CHAR;
                        break;

                    case BOX_IN_STORAGE_CHAR:
                        data[y][x] = element;

                        Box box = new Box(x, y);
                        box.setInstalled(true);
                        boxes.add(box);

                        goals.add(new Point(x, y));
                        storagePlaces++;
                        break;

                    case PLAYER_ON_STORAGE_CHAR:
                        data[y][x] = element;

                        player = new Player(x, y);

                        goals.add(new Point(x, y));
                        storagePlaces++;
                        break;

                    default:
                        // TODO: Check for invalid symbols.
                        String errorMessage = "Could not load " + name + "\nIncorrect character at " + x + ", " + y + ": \"" + element + "\" in\n" + level;

                        throw new InvalidSymbolException(errorMessage);
                }
            }
            for(; x < width; x++){
                data[y][x] = FLOOR_CHAR;
            }
         }


        // TODO: check if player is not null, if it is complain with an exception;
        if(player == null){
            System.out.println(name);
            throw new GameFilesCorruptedException("File with level " + name + " is corrupted. Try to reinstall the game");
        }
        // TODO: check if u have at east one box, if it is complain with an exception;
        if(boxes.isEmpty()){
            throw new BoxInitializationException("Zero boxes on field");
        }
        // TODO: check if number of boxes is equal to number of storagePlaces, and
        // TODO: if it is complain with an exception;
        if(boxes.size() != storagePlaces){
            String message;
            if(boxes.size() > storagePlaces){
                message = "More boxes then storage places";
            }
            else {
                message = "Less boxes then storage places";
            }
            throw new BoxInitializationException(message);
        }

        return new Level(name, player, boxes, walls, goals, data);
    }
    boolean isSolvedMethod() {
        if(boxes.isEmpty()){
            return false;
        }
        for (int i = 0; i < boxes.size(); i++) {
            if (!boxes.get(i).isInstalled()) {
                return false;
            }
        }
        return true;
    }

    // GETTERS

    // Level data getters
    String getName(){ return name; }
    int getBestRecord(){
        return bestRecord;
    }
    int getHeight(){ return dataToDraw.length; }
    int getWidth(){ return dataToDraw[0].length; }
    char[][] getDataToDraw() { return dataToDraw; }

    // Dynamic Objects Getter
    Player getPlayer() { return player; }

    ArrayList<Box> getBoxes() { return boxes; }
    ArrayList<Point> getWalls() { return walls; }
    ArrayList<Point> getGoals() { return goals; }
    ArrayList<Point> getPlayerToUndo() { return playerToUndo; }
    ArrayList<Point> getPlayerToRedo() { return playerToRedo; }
    ArrayList<Point>[] getBoxesToUndo(){ return boxesToUndo; }
    ArrayList<Point>[] getBoxesToRedo() { return boxesToRedo; }
    ArrayList<Integer> getDirectionToUndo() { return directionToUndo; }
    ArrayList<Integer> getDirectionToRedo() { return directionToRedo; }
}
