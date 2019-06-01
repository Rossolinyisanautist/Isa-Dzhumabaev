import java.awt.*;
import java.util.*;

class Snake {

    final static int COLOR = 0xffd1c34b;
    final static int DEAD_COLOR = 0xff514c1d;
    final static int DEAD_STROKE = 0xff383413;
    final static int STROKE = 0xffb5a841;

    private ArrayList<Point> body;
    private Field field;
    private int head;
    private int dx, dy;
    private int speed;
    private boolean isAlive;

    Snake(Field field, int x, int y, int speed){
        this.field = field;
        body = new ArrayList<>();
        body.add(new Point(x, y));
        head = 0;
        this.speed = this.dx = speed;
        this.dy = 0;
        isAlive = true;
    }
    void move(){
        if(!isAlive){
            return;
        }

        int nextX = getHeadX() + dx;
        int nextY = getHeadY() + dy;
        head = (head + 1) % body.size();

        if(!field.isPointInside(nextX, nextY)){
            isAlive = false;
        }
        else {
            setX(nextX);
            setY(nextY);
        }
    }

    boolean collides(int x, int y){
        for(Point bodyPart : body) {
            if(bodyPart.x == x && bodyPart.y == y){
                return true;
            }
        }
        return  false;
    }
    boolean headCollides(Fruit fruit){
        return getHeadX() == fruit.getX() &&
               getHeadY() == fruit.getY();
    }
    void grow(){
        body.add(head + 1, new Point(getHeadX(), getHeadY()));
        move();
    }
    void turnUp(){
        if(dy >= 0){
            dy = -speed;
            dx = 0;
        }
    }
    void turnDown(){
        if(dy <= 0){
            dy = speed;
            dx = 0;
        }
    }
    void turnLeft(){
        if(dx <= 0){
            dy = 0;
            dx = -speed;
        }
    }
    void turnRight(){
        if(dx >= 0){
            dy = 0;
            dx = speed;
        }
    }
    private int getHeadX(){
        return body.get(head).x;
    }
    private int getHeadY(){
        return body.get(head).y;
    }

    void setX(int x) {
        body.get(head).x = x;
    }

    void setY(int y) {
        body.get(head).y = y;
    }

    ArrayList<Point> getBody(){
        return new ArrayList<>(body);
    }
    boolean isAlive(){
        return isAlive;
    }
    void setAlive(){
        isAlive = true;
    }
}
