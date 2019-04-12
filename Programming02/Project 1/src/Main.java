import processing.core.PApplet;

public class Main extends PApplet {
    private Field field;

    public void settings(){
        fullScreen();
//        size(200 * 16 / 9, 200);
    }
    public void setup(){
        int cellSize = min(width / Field.DEFAULT_WIDTH, height / Field. DEFAULT_HEIGHT);
        field = new Field(cellSize);
//        field = new Field(width, height, cellSize);
    }
    public void draw(){
        background(0);
        Draw.field(this, field);
    }
    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
