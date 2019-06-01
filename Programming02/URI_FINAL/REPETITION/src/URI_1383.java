import java.util.*;

public class URI_1383 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        while(k <= n){
            Integer[][] matrix = new Integer[9][9];
            Integer[][] transparent = new Integer[9][9];
            boolean rowsAreOK = true, columnsAreOK = true, boxesAreOK = true;

            for(int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    matrix[i][j] = sc.nextInt();
                    transparent[j][i] = matrix[i][j];
                }
            }
            for(int i = 0; i < 9; i++){
                ArrayList<Integer> row = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(matrix[i])));
                ArrayList<Integer> column = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(transparent[i])));

                if(rowsAreOK && !row.equals(Arrays.asList(matrix[i]))){
                    rowsAreOK = false;
                }
                else if(columnsAreOK && !column.equals(Arrays.asList(transparent[i]))){
                    columnsAreOK = false;
                }
                else if(boxesAreOK && !checkBoxes(matrix)){
                    boxesAreOK = false;
                }
            }
            System.out.println("Instancia " + k++);
            System.out.println(columnsAreOK && rowsAreOK && boxesAreOK ? "SIM\n" : "NAO\n");
        }
    }
    static boolean checkBoxes(Integer[][] solution){
        ArrayList<Integer> box = new ArrayList<>();

        int jStart = 0;
        int jEnd = 3;

        while(jStart < 9){
            for(int i = 0; i < 9; i ++) {
                for(int j = jStart; j < jEnd; j++){
                    box.add(solution[i][j]);
                }
                if(box.size() == 9){
                    ArrayList<Integer> boxSet = new ArrayList<>(new LinkedHashSet<>(box));
                    if(!box.equals(boxSet)){
                        return false;
                    }
                box.clear();
                }
            }
            jEnd += 3;
            jStart += 3;
        }
        return true;
    }
}