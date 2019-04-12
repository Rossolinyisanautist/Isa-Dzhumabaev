import processing.core.PApplet;

public class Main extends PApplet {
    private Field field;
    private Fruit fruit;
    private Snake snake;

    public void settings(){
        fullScreen();
    }
    public void setup(){
        surface.setResizable(true);
        field = new Field(this);
        fruit = new Fruit(field);
        snake = new Snake();
    }
    public void draw(){
        background(0);
        Draw draw = new Draw(this, field, fruit, snake);
        strokeWeight(2);
        draw.field();
        draw.fruit();
    }
    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
