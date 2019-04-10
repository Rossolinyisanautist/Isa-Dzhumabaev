class Turtle {
    private int x, y;
    private int dx, dy;
    private boolean isPenDown;

    Turtle(){
        x = 0;
        y = 0;
        dx = 0;
        dy = 1;
    }
    void penUp(){
        isPenDown = false;
    }
    void penDown(){
        isPenDown = true;
    }
    void move(int distance, Field field){
        for(int i = 0; i < distance; i++){
            int nextX = x + dx;
            int nextY = y + dy;
            if(nextX >= Field.getWIDTH() || nextX < 0 || nextY >= Field.getHEIGHT() || nextY < 0){
                break;
            }
            if(isPenDown){
                field.markPoint(y,x);
            }
            y = nextY;
            x = nextX;
        }
    }
    void turnRight(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dx = -dx;
    }
    void turnLeft(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dy = -dy;
    }

    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
}