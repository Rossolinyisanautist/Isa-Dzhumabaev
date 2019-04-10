import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{ String  givenDNA = sc.next(), requiredDNA = sc.next();
            System.out.println(givenDNA.contains(requiredDNA) ? "Resistente" : "Nao resistente");
        }while(sc.hasNext());
    }
}