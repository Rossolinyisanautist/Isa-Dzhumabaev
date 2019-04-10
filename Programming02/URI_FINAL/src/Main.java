import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, x2, y2, diffX, diffY, result;
        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            if((x + y + x2 + y2) == 0)
                break;

            diffX = Math.abs(x - x2);
            diffY = Math.abs(y - y2);

            if(diffX == 0 || diffY == 0)
                result = diffX == diffY ? 0 : 1;
            else if (diffX == diffY)
                result = 1;
            else
                result = 2;

            System.out.println(result);
        }
    }
}/*
4 4 6 2
3 5 3 5
5 5 4 3
1 1 1 2
0 0 0 0

*/