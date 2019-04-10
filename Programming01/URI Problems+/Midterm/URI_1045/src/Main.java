import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner ip = new Scanner(System.in);
        //double n1=ip.nextDouble(),n2=ip.nextDouble(),n3=ip.nextDouble();
        double[] list = new double [3];
        list[0]=ip.nextDouble();
        list[1]=ip.nextDouble();
        list[2]=ip.nextDouble();
        int a;
        for (int i =0; i < list.length-1;i++){
            a=i;
            for (int j=i;j<list.length;j++){
                if (list[a]<list[j])
                    a=j;
            }
            double l = list[i];
            list[i]=list[a];
            list[a]=l;

        }
        double n1=list[0];
        double n2=list[1];
        double n3=list[2];

        if (n1>=n2+n3){
            System.out.println("NAO FORMA TRIANGULO");
            return;}
        if (n1*n1==(n2*n2)+(n3*n3))
            System.out.println("TRIANGULO RETANGULO");
        if (n1*n1>n2*n2+n3*n3)
            System.out.println("TRIANGULO OBTUSANGULO");
        if (n1*n1<(n2*n2)+(n3*n3))
            System.out.println("TRIANGULO ACUTANGULO");
        if(n1==n2&&n1==n3&&n2==n3)//ЕСЛИ ЧТО ПРОВЕРЬ ТУТ
            System.out.println("TRIANGULO EQUILATERO");
        if (n1==n2&&n1!=n3||n1==n3&&n1!=n2||
                n2==n3&&n2!=n1||n2==n1&&n2!=n3||
                n3==n1&&n3!=n2||n3==n2&&n3!=n1)        //ЕСЛИ ЧТО ПРОВЕРЬ ТУТ ТОЖЕ
            System.out.println("TRIANGULO ISOSCELES");

    }

}