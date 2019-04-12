import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> solution = new ArrayList<>();

        int n = sc.nextInt(), count = 1;
        while(count <= n){

     // getMatrix(ArrayList<ArrayList<Integer>> matrix){
            for(int i = 0; i < 9; i++){
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j = 0; j < 9; j++){
                    int input = sc.nextInt();
                    temp.add(input);
                }
                solution.add(temp);
            }
     // }

            boolean answer = checkRows(solution) &&
                             checkColumns(solution) &&
                             checkBoxes(solution);

            System.out.printf("Instancia %d%n%s%n%n", count++, answer ? "SIM" : "NAO");
            solution.clear();
        }
    }

    static boolean checkRows(ArrayList<ArrayList<Integer>> solution){
        int i;
        for(i = 0; i < 9; i++){
            ArrayList<Integer> newRow = new ArrayList<>(new LinkedHashSet<>(solution.get(i)));

            if(!newRow.equals(solution.get(i))){
                return false;
            }
        }
        return true;
    }

    static boolean checkColumns(ArrayList<ArrayList<Integer>> solution){
        int i, j;
        for(i = 0; i < 9; i++){
            ArrayList<Integer> column = new ArrayList<>();
            for(j = 0; j < 9; j++){
                column.add(solution.get(j).get(i));
            }
            ArrayList<Integer> newColumn = new ArrayList<>(new LinkedHashSet<>(column));
            if(!column.equals(newColumn)){
                return false;
            }
        }
        return true;
    }

    static boolean checkBoxes(ArrayList<ArrayList<Integer>> solution){
        ArrayList<Integer> box = new ArrayList<>();

        int startJ = 0, limJ = 3, i, j;
        while(startJ < 9){
            for(i = 0; i < 9; i++){
                for(j = startJ; j < limJ; j++){
                    box.add(solution.get(i).get(j));
                }
                if((i+1) % 3 == 0){
                    ArrayList<Integer> newBox = new ArrayList<>(new LinkedHashSet<>(box));
                    if(!newBox.equals(box)){
                        return false;
                    }
                    box.clear();
                }
            }
            startJ += 3;
            limJ += 3;
        }
        return true;
    }
}
/*

*/