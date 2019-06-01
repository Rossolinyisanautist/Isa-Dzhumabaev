import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            int numberOfCommands = sc.nextInt(); sc.nextLine();
            String[] commands = new String[numberOfCommands];
            int X = 0;
            for(int i = 0; i < numberOfCommands; i++){
                commands[i] = sc.nextLine();
            }
            for(int i = 0; i < numberOfCommands; i++){
                String action = commands[i];
                int length = action.split(" ").length;
                if(length == 3){
                    action = getAction(action, commands);
                }

                if(action.equals("RIGHT")){
                    X++;
                }
                else if(action.equals("LEFT")){
                    X--;
                }
            }
            System.out.println(X);
        }
    }
    static String getAction(String command, String[] commands){
        String[] action = command.split(" ");
        int index = Integer.parseInt(action[2]) - 1;
        command = commands[index];
        if(command.split(" ").length == 3){
            return getAction(command, commands);
        }
        return command;
    }
}/*
2
3
LEFT
RIGHT
SAME AS 2
5
LEFT
SAME AS 1
SAME AS 2
SAME AS 1
SAME AS 4

*/