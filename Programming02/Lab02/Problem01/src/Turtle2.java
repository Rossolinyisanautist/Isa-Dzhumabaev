public class Turtle2 {
    private int x, y,
                dx, dy;
    private boolean isPendDown;
    Turtle2(){
        x = 0;
        dx = 1;
        y = 0;
        dy = 0;
        isPendDown = false;
    }
    void move(int steps, Field2 field){
        for(int i = 0; i < steps; i++){
            int newX = x + dx;
            int newY = y + dy;
            if(newX >= Field2.getWIDTH() || newX < 0 || newY >= Field2.getHEIGHT() || newY < 0)
                break;
            if(isPendDown)
                field.markCell(x, y);
            x = newX;
            y = newY;
        }
    }
    void penUp(){
        isPendDown = false;
    }
    void penDown(){
        isPendDown = true;
    }
    void turnRight(){
        int temp = dx;
        dx = dy;
        dy = temp;
        dy = -dy;
    }
    void turnLeft(){
        int temp = dx;
        dx = dy;
        dy = temp;
        dx = -dx;
    }

    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
}
