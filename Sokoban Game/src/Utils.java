import GameErrors.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

class Utils {
    static ArrayList<Level> loadLevels(String filePath, String fileName) throws GameFilesCorruptedException,
                                                                NullPointerException,
                                                                BoxInitializationException,
                                                                InvalidSymbolException,
                                                                LevelDataCorruptedException
    {
        ArrayList<Level> levels = new ArrayList<>();
        try{
//            System.out.println(filePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            Scanner sc = new Scanner(bufferedReader);

            String line;
            StringBuilder levelString = new StringBuilder();

            while(sc.hasNextLine()){

                line = sc.nextLine();
                levelString.append(line).append('\n');

                System.out.println(levelString);

                // TODO: process multiple empty lines. Make parser to ignore them and skip.
                // TODO: Skip empty lines
                if(!line.isEmpty()){
                    if(line.charAt(0) == ';'){
                        System.out.println("PARSING");
                        Level level = Level.parseLevel(levelString.toString(), fileName);
                        level.setName(fileName);
                        levels.add(level);
                        levelString = new StringBuilder();
                    }
                }
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            throw new LevelFileNotFoundException(
                "The level file \"" + filePath + "\" was not found. Try to reinstall the game");
//            e.printStackTrace();
        }
        catch (GameFilesCorruptedException e){
            throw new GameFilesCorruptedException(e.getMessage());
        }
        return levels;
    }
    static BufferedImage getImage(String path) throws ImageNotFoundException {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            throw new ImageNotFoundException("Image at" + path + "not found");
        }
    }
}

