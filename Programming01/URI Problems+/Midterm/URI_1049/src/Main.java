import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner ip = new Scanner(System.in);

        String[][] vertebrado = new String[2][2];
        vertebrado[0][0] = "aguia";
        vertebrado[0][1] = "pomba";
        vertebrado[1][0] = "homem";
        vertebrado[1][1] = "vaca";

        String[][] invertebrado = new String[2][2];
        invertebrado[0][0] = "pulga";
        invertebrado[0][1] = "lagarta";
        invertebrado[1][0] = "sanguessuga";
        invertebrado[1][1] = "minhoca";

        String I = ip.next();

        if (Objects.equals(I,"vertebrado")){
            String J = ip.next();
            for (int i=0;i==0&&Objects.equals(J,"ave");) {
                String L = ip.next();
                if (Objects.equals(L, "carnivoro")){
                    System.out.println(vertebrado[0][0]);
                    i=i+1; }
                else if (Objects.equals(L, "onivoro")){
                    System.out.println(vertebrado[0][1]);
                    i=i+1; }
            }
            for (int i=0;i==0&&Objects.equals(J, "mamifero");) {
                String L = ip.next();
                if (Objects.equals(L,"onivoro")){
                    System.out.println(vertebrado[1][0]);
                    i=i+1;}
                else if (Objects.equals(L,  "herbivoro")){
                    System.out.println(vertebrado[1][1]);
                    i=i+1;}
            }
        }
        else if (Objects.equals(I,"invertebrado")){
            String J = ip.next();
            for (int i=0;i==0&&Objects.equals(J, "inseto");) {
                String L = ip.next();
                if (Objects.equals(L,"hematofago")){
                    System.out.println(invertebrado[0][0]);
                    i=i+1;}
                else if (Objects.equals(L,"herbivoro")){
                    System.out.println(invertebrado[0][1]);
                    i=i+1;}
            } for (int i=0;i==0&&Objects.equals(J,"anelideo");){
                String L = ip.next();
                if (Objects.equals(L, "hematofago")){
                    System.out.println(invertebrado[1][0]);
                    i=i+1;}
                else if (Objects.equals(L,"onivoro")){
                    System.out.println(invertebrado[1][1]);
                    i=i+1;}
            }

        }

    }

}