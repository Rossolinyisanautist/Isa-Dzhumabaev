import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Field2 field = new Field2();
        Turtle2 turtle = new Turtle2();
        boolean isWorking = true;

        turtle.turnLeft();
        while(isWorking){
            String[] input = sc.nextLine().toLowerCase().split(" ");
            String command = input[0];
            switch (command){
                case "move":
                    if(input.length > 1)
                        turtle.move(Integer.parseInt(input[1]), field);
                    else
                        System.out.println("Number of steps is not specified");
                    break;
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
                case "print":
                    field.printField(turtle);
                    break;
                case "exit":
                    isWorking = false;
                    break;

            }
        }
    }

}
