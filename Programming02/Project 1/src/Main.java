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
        snake = new Snake(field,0,0, 1);
        fruit = new Fruit(field, snake);
    }

    public void draw(){
        background(0);

        snake.move();

        if(snake.headCollides(fruit)){
            snake.grow();
            fruit = new Fruit(field, snake);
        }
        Draw draw = new Draw(this, field, fruit, snake);
        draw.field();
        draw.fruit();
        draw.snake();

        delay(100);

    }
    @Override
    public void keyPressed() {
        switch (keyCode){
            case UP:
                snake.turnUp();
                break;
            case DOWN:
                snake.turnDown();
                break;
            case LEFT:
                snake.turnLeft();
                break;
            case RIGHT:
                snake.turnRight();
                break;
        }
    }




    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
