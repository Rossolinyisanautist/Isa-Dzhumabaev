import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){

            int N = sc.nextInt();
            if(N == 0) {
                break;
            }

            Direction direction;

            try{
                direction = new Direction();

                String commandSequence = sc.next();

                for (char command : commandSequence.toCharArray()){
                    switch (command){
                        case 'D':
                            direction.turnRight();
                            break;
                        case 'E':
                            direction.turnLeft();
                            break;
                    }
                }

                System.out.println(direction.getDirection());

            }catch (OnlyCardinalDirectionException e){
                System.err.println(e.getMessage());
            }
        }
    }
}

class Direction{

    private int dx;
    private int dy;
    private String direction;

    Direction() throws OnlyCardinalDirectionException {
        this(0, 1);
    }
    Direction(int dx, int dy) throws OnlyCardinalDirectionException {
        this.dx = dx;
        this.dy = dy;
        direction = resetDirection();
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

    private String resetDirection() throws OnlyCardinalDirectionException {
        if(dx == 0 && dy == 1){
            return "N"; // North
        }
        else if(dx == 1 && dy == 0) {
            return "L"; // East
        }
        else if(dx == 0 && dy == -1){
            return "S"; // South
        }
        else if(dx == -1 && dy == 0){
            return "O"; // West
        }
        else {
            throw new OnlyCardinalDirectionException();
        }
    }
    String getDirection() throws OnlyCardinalDirectionException {
        direction = resetDirection();
        return direction;
    }
}
class OnlyCardinalDirectionException extends Exception{

    private String message;

    OnlyCardinalDirectionException(){
        message = "Use cardinal directions only: North, South, West, East";
    }
    public String getMessage(){
        return message;
    }
}

/*
3
DDE
2
EE
0
*/
