import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Turtle turtle = new Turtle();
        Field field = new Field();

        boolean isWorking = true;
        do{
            String command = sc.nextLine();
            String[] parts = command.split(" ");
            command = parts[0].toLowerCase();

            switch(command){
                case "move":
                    if(parts.length > 1)
                        turtle.move(Integer.parseInt(parts[1]), field);
                    else
                        System.out.println("The number of steps is not specified");
                    break;
                case "pendown":
                    turtle.penDown();
                    break;
                case "penup":
                    turtle.penUp();
                    break;
                case "turnleft":
                    turtle.turnLeft();
                    break;
                case "turnright":
                    turtle.turnRight();
                    break;
                case "print":
                    field.printField(turtle);
                    break;
                case "exit":
                    isWorking = false;
                    break;
                default:
                    System.out.println("Unknown command");
            }

        }while(isWorking);
    }
}
