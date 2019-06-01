public class Box {

    int x;
    int y;
    boolean isInstalled;

    Box(int x, int y){
        this.x = x;
        this.y = y;
        isInstalled = false;
    }

    void move(int direction){
        switch (direction){
            case 1:
                up();
                break;
            case 2:
                down();
                break;
            case 3:
                left();
                break;
            case 4:
                rigth();
                break;
        }
    }

    private void left(){
        if(x == 0){ x = 7; }
        else { x--; }
    }
    private void rigth(){
        if(x == 7){ x = 0; }
        else { x++; }
    }
    private void up(){
        if(y == 0){ y = 7; }
        else { y--; }
    }
    private void down(){
        if(y == 7){ y = 0; }
        else { y++; }
    }
}
