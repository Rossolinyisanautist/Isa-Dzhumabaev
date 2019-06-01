import java.util.Scanner;

public class URI_1574 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int robotX = 0;
            int numberOfcommands = sc.nextInt();
            sc.nextLine();
            String[] commands = new String[numberOfcommands];

            for (int i = 0; i < numberOfcommands; i++) {
                commands[i] = sc.nextLine();
            }
            for (int i = 0; i < numberOfcommands; i++) {
                String action = commands[i];
                if (action.split(" ").length == 3) {
                    action = getAction(action, commands);
                }

                if (action.equals("LEFT")) {
                    robotX--;
                } else {
                    robotX++;
                }
            }
            System.out.println(robotX);
        }
    }
    static String getAction(String command, String[] commands) {
        int index = Integer.parseInt(command.split(" ")[2]) - 1;
        command = commands[index];
        if (command.split(" ").length == 3) {
            return getAction(command, commands);
        }
        return command;
    }
}
/*


*/












































