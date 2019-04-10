import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            String  givenDNA = sc.next(), requiredDNA = sc.next();
            if(givenDNA.contains(requiredDNA))
                System.out.println("Resistente" );
            else
                System.out.println("Nao resistente");
        }while(sc.hasNext());
    }
}