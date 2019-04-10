import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your coordinate: ");
        int yourCoordinate = sc.nextInt();
        System.out.print("Coordinate of a 1st point: ");
        int firstPoint = sc.nextInt();
        System.out.print("Coordinate of a 2nd point: ");
        int secondPoint = sc.nextInt();
        String point = "Both point are on same distance. Distance ";

        int distance = abs( firstPoint - yourCoordinate);
        if(abs( firstPoint - yourCoordinate) < abs( secondPoint - yourCoordinate)){
            point = "First point is closer. Distance ";
        }
        else if (abs( firstPoint - yourCoordinate) > abs( secondPoint - yourCoordinate)){
            distance = abs(secondPoint - yourCoordinate);
            point = "Second point is closer. Distance ";
        }

        System.out.println(point + distance);
    }
    public static int abs(int number){
        return number < 0 ? -number : number;
    }
}
