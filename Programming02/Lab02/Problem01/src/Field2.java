public class Field2 {
    private final static int WIDTH = 20;
    private final static int HEIGHT = 20;
    private final static char MARKED_CELL = '*';
    private final static char EMPTY_CELL = '.';
    private final static char TURTLE_CELL = 'T';

    private char[][] plane = new char[WIDTH][HEIGHT];

    Field2(){
        for(int x = 0; x < WIDTH; x++){
            for(int y = 0; y < HEIGHT; y++){
                plane[x][y] = EMPTY_CELL;
            }
        }
    }

    void printField(Turtle2 turtle){
        for(int x = 0; x < WIDTH; x++){
            for(int y = 0; y < HEIGHT; y++){
                if(x == turtle.getX() && y == turtle.getY())
                    System.out.print(TURTLE_CELL);
                else
                    System.out.print(plane[x][y]);
            }
            System.out.println();
        }
    }
    void markCell(int x, int y){
        plane[x][y] = MARKED_CELL;
    }

    static int getWIDTH() {
        return WIDTH;
    }
    static int getHEIGHT() {
        return HEIGHT;
    }
}
