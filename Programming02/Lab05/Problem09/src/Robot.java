public class Robot {
    int x;
    int y;

    // 1 up
    // 2 down
    // 3 left
    // 4 right
    int direction;

    Robot(){
        x = 0;
        y = 0;
        direction = 4;
    }
    void left(){
        if(x == 0){ x = 7; }
        else { x--; }
        direction = 3;
    }
    void rigth(){
        if(x == 7){ x = 0; }
        else { x++; }
        direction = 4;
    }
    void up(){
        if(y == 0){ y = 7; }
        else { y--; }
        direction = 1;
    }
    void down(){
        if(y == 7){ y = 0; }
        else { y++; }
        direction = 2;
    }
}
