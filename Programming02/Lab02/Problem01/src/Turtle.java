class Turtle {
    private int x, y,
                dx,dy;
    private boolean isPenDown;
    Turtle(){
        x = 0;
        y = 0;
        dx = 1;
        dy = 0;
        isPenDown = false;
    }
    void penUp(){
        isPenDown = false;
    }
    void penDown(){
        isPenDown = true;
    }
    void move(int steps, Field field){
        for(int i = 0; i < steps; i++){
            int newX = x + dy;
            int newY = y + dx;
            if( newX >= Field.getWIDTH() || newX < 0 ||
                newY >= Field.getHEIGHT() || newY < 0){
                break;
            }
            if(isPenDown){
                field.markPoint(x, y);
            }
            x = newX;
            y = newY;
        }
    }
    void turnRight(){
        int tmp = dx;
        dx = dy;
        dy = tmp;

        dx = -dx;
    }
    void turnLeft(){
        int tmp = dx;
        dx = dy;
        dy = tmp;

        dy = -dy;
    }

    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
}
