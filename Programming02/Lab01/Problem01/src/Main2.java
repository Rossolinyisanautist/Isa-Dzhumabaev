import java.util.Scanner;

public class Main2 {

    //Turtle Data
    final static char TURTLE = 'T';
    static int turtleX, turtleY;
    static int dx, dy;
    static boolean isPenDown;

    //Field
    final static int WIDTH = 20;
    final static int HEIGHT = 20;
    final static char EMPTY_CELL = '.';
    final static char MARKED_CELL = '*';
    static char[][] space;

    public static void main(String[] args) {
        initializeTurtle();
        initializeField();
        Scanner sc = new Scanner(System.in);
        boolean working = true;
        do{
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0].toLowerCase();
            switch (command){
                case "penup":
                    penUp();
                case "pendown":
                    penDown();
                case "turnleft":
                    turnLeft();
                case "turnright":
                    turnRigth();
                case "move":
                    if(parts.length > 1){
                        int steps = Integer.parseInt(parts[1]);
                        Move(steps);
                    }
                case "print":
                    print();
                case "exit":
                    working = false;
                    break;
            }
        }while(working);
    }

    //Turtle Methods
    public static void initializeTurtle(){
        turtleX = turtleY = 0;
        dy = 0;
        dx = 0;
    }
    //Field Methods

    public static void initializeField(){
        space = new char[HEIGHT][WIDTH];
        for(int j = 0; j < HEIGHT; j++){
            for(int i = 0; i < WIDTH; i++){
                space[j][i] = EMPTY_CELL;
            }
        }
    }
    //Print
    public static void print(){
            for(int x = 0; x < HEIGHT; x++) {
                for (int y = 0; y < WIDTH; y++) {
                    if (y == turtleX && x == turtleY) {
                        space[x][y] = TURTLE;
                    } else {
                        space[x][y] = EMPTY_CELL;
                    }
                    System.out.print(space[x][y]);
                }
                System.out.println();
            }
    }
     public static void penUp(){
        isPenDown = false;
        }
     public static void penDown(){
        isPenDown = true;
        }
     public static void Move(int distance){
        for(int i = 0; i < distance; i++){
            int nextX = turtleX + dx;
            int nextY = turtleY + dy;
            if( nextX >= WIDTH || nextX < 0 ||
                nextY >= HEIGHT || nextY < 0){
                break;
            }
            if(isPenDown){
                space[turtleX][turtleY] = MARKED_CELL;
            }
            turtleX = nextX;
            turtleY = nextY;
        }
    }
    public static void turnRigth(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dx = -dx;
    }
    public static void turnLeft(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dy = -dy;
    }
}
