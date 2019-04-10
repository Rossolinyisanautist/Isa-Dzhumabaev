class Field {
    private char[][] space;
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;
    private static final char EMPTY_CELL = '.';
    private static final char MARKED_CELL = '*';
    private static final char TURTLE = 'T';

    Field(){
        space = new char[WIDTH][HEIGHT];
        for(int i = 0; i < WIDTH; i++){
            for(int j = 0; j < HEIGHT; j++){
                space[i][j] = EMPTY_CELL;
            }
        }
    }
    void printField(Turtle turtle){
        for(int x = 0; x < WIDTH; x++){
            for(int y = 0; y < HEIGHT; y++){
                if(x == turtle.getX() && y == turtle.getY()){
                    System.out.print(TURTLE);
                }
                else {
                    System.out.print(space[x][y]);
                }
            }
            System.out.println();
        }
    }
    void markPoint(int x, int y){
        space[x][y] = MARKED_CELL;
    }

    static int getWIDTH() {
        return WIDTH;
    }
    static int getHEIGHT() {
        return HEIGHT;
    }
}
