import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class URI_1245 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            sc.nextLine();
            int count = 0;
            ArrayList<String> boots = new ArrayList<>();
            for(int i = 0; i < n; i++){
                boots.add(sc.nextLine());
            }
            for(int i = 0; i < boots.size(); i++){
                String boot = boots.get(i);
                String side = boot.split(" ")[1];
                String toFind = boot.split(" ")[0].concat(" ");
                toFind = toFind.concat(side.equals("E") ? "D" : "E");
//                System.out.println("Current: " + boot);
//                System.out.println("toFind: " + toFind);
                if(boots.contains(toFind)){
                    count++;
                    boots.remove(boot);
                    boots.remove(toFind);
                }
            }
            System.out.println(count);

        }while(sc.hasNext());
    }
}
