package GameErrors;
import java.io.FileNotFoundException;

public class GameFilesCorruptedException extends Exception{
    public GameFilesCorruptedException(String s){
        super(s);
    }
}
