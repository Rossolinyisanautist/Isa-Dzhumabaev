import processing.core.*;

import java.awt.*;

class Draw {

    private PApplet applet;
    private Field field;
    private Fruit fruit;
    private Snake snake;

    Draw(PApplet applet, Field field, Fruit fruit, Snake snake){
        this.applet = applet;
        this.field = field;
        this.fruit = fruit;
        this.snake = snake;
    }

    void field(){

        float cellSize = field.getCellSize();

        for(int y = 0; y < field.getNumberOfCells(); y++){
            for(int x = 0; x < field.getNumberOfCells(); x++){

                float cellX = screenX(x);
                float cellY = screenY(y);

                applet.strokeWeight(2);
                applet.stroke(Cell.STROKE);
                applet.fill(Cell.COLOR);
                applet.rect(cellX, cellY, cellSize, cellSize);
            }
        }
    }
    void snake(){

        float bodySize = fruit.getSize();

        applet.strokeWeight(3);
        applet.stroke(snake.isAlive() ? Snake.STROKE : Snake.DEAD_STROKE);
        applet.fill(snake.isAlive() ? Snake.COLOR : Snake.DEAD_COLOR);
        applet.rectMode(PConstants.CORNER);

        for(Point bodyPart : snake.getBody()){
            float x = screenX(bodyPart.x);
            float y = screenY(bodyPart.y);

            applet.rect(x, y, bodySize, bodySize, 7);
        }
    }
    void fruit(){
        float fruitSize = fruit.getSize();
        float x = screenX(fruit.getX());
        float y = screenY(fruit.getY());

        applet.stroke(Fruit.STROKE);
        applet.fill(Fruit.COLOR);
        applet.ellipseMode(PConstants.CORNER);
        applet.ellipse(x, y, fruitSize, fruitSize);

        applet.stroke(Fruit.LEAF_COLOR);
        applet.strokeWeight(fruit.getLeafSize());
        applet.line(x + 10, y + 5, x , y - 5);
        applet.strokeWeight(fruit.getLeafSize());
        applet.line(x + 10, y + 5, x + 15 , y - 10);
    }

    float screenX(float x){
        float cellSize = field.getCellSize();
        float finalFieldWidth = cellSize * field.getNumberOfCells();
        float shiftX = (applet.width - finalFieldWidth) / 2;
        return shiftX + x * cellSize;
    }
    float screenY(float y){
        float cellSize = field.getCellSize();
        float finalFieldWidth = cellSize * field.getNumberOfCells();
        float shiftX = (applet.height- finalFieldWidth) / 2;
        return shiftX + y * cellSize;
    }

}
