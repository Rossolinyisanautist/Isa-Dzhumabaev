import java.util.Scanner;
public class Main2 {

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

//        while(true){
            float   A = ip.nextFloat(),
                    B = ip.nextFloat(),
                    C = ip.nextFloat(),
                    D = ip.nextFloat();
            float average = ((A*2)+(B*3)+(C*4)+(D*1))/10;
            System.out.printf("Media: %.1f\n", average);

            if (average >= 7.0f){
                System.out.println("Aluno aprovado.");
            }
            else if(average < 5.0f){
                System.out.println("Aluno reprovado.");
            }
            else if (average < 7.0f && average >= 5.0f){
                System.out.println("Aluno em exame.");
                float E = ip.nextFloat();
                float average1 = (E+average)/2;

                System.out.printf("Nota do exame: %.1f\n", E);
                if (average1 >= 5.0f) {
                    System.out.println("Aluno aprovado.");
                }
                else if (average1 < 5.0f){
                    System.out.println("Aluno reprovado.");
                }
                System.out.printf("Media final: %.1f\n", average1);
            }
//        }
    }
}
/*
7 7 7 6,000000009
5,0000000001010203

5,95 5,95 5,95 5,95

 */
