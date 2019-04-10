class Field {
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;
    private static final char EMPTY_CELL = '.';
    private static final char TURTLE_SYMBOL = 'T';
    private final static char MARKED_CELL = '*';

    private char[][] space;

    Field(){
        space = new char[HEIGHT][WIDTH];
        for(int i = 0; i < HEIGHT; i++){
            for(int j = 0; j < WIDTH; j++){
                space[i][j] = EMPTY_CELL;
            }
        }
    }
    void printField(Turtle turtle){
        for(int y = 0; y < HEIGHT; y++){
            for(int x = 0; x < WIDTH; x++){
                if(turtle.getX() == x && turtle.getY() == y){
                    System.out.print(TURTLE_SYMBOL);
                }
                else{
                    System.out.print(space[y][x]);
                }
            }
            System.out.println();
        }
    }
    void markPoint(int y, int x){
        space[y][x] = MARKED_CELL;
    }
    static int getWIDTH() {
        return WIDTH;
    }
    static int getHEIGHT() {
        return HEIGHT;
    }
}