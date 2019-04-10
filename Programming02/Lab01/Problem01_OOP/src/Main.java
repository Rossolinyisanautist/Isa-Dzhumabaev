import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        Field field = new Field();
        Scanner sc = new Scanner(System.in);

        boolean working = true;
        do{
            String command = sc.nextLine();
            String[] parts = command.split(" ");
            command = parts[0].toLowerCase();

            switch (command){
                case "penup":
                    turtle.penUp();
                    break;
                case "pendown":
                    turtle.penDown();
                    break;
                case "turnleft":
                    turtle.turnLeft();
                    break;
                case "turnright":
                    turtle.turnRight();
                    break;
                case "move":
                    if(parts.length > 1){
                        int steps = Integer.parseInt(parts[1]);
                        turtle.move(steps, field);
                    }
                    else {
                        System.err.println("The number of steps is not specified");
                    }
                    break;
                case "print":
                    field.printField(turtle);
                    break;
                case "exit":
                    working = false;
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }while(working);
    }
}