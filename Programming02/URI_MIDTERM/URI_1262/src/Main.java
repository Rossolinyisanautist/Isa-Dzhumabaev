import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String trace;
        int numberOfCycles = 0, procs;
        do{
            numberOfCycles = 0;
            trace = sc.next();
            procs = sc.nextInt();
            sc.nextLine();
            //first check W
            for(int i = 0; i < trace.length(); i++){
                if(trace.charAt(i) == 'W'){
                    numberOfCycles++;
                }
                else if (trace.charAt(i) == 'R'){
                    numberOfCycles++;
                    int j = i + 1;                                                      // j > i на 1, чтобы проверить следующую букву (через 2 строчки в коде).
                    for(int k = 1; k != procs && j < trace.length(); j++, i++, k++){    // i увеличивается, чтобы она сохранила своё знаечение,
                        if(trace.charAt(j) == 'W'){                                     // когда будет найдена W.
                            break;                                                      // k отслеживает через сколько R мы уже прошли.
                        }                                                               // j увеличивается, чтобы каждый раз проверять следующую букву.
                    }
                }
            }
            System.out.println(numberOfCycles);
        }while (sc.hasNext());
    }
}/*
RWWRRR
3
RWWRRRR
3
WWWWW
5
RRRRRRRRRR
4
RWRRWWRWRWRRRWWRRRRWRRWRRWRRRRRRRRRWRWRWRRRRWRRRRR
4
*/