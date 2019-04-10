import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numOfYears = inp.nextInt();
        double population = 312032486;
        double BirthsPerYear = 1.0/7*60*60*24*365;
        double DeathsPerYear = 1.0/13*60*60*24*365;
        double ImigrantsPerYear = 1.0/45*60*60*24*365;

        for(int i = 1 ; i<=numOfYears;i++){
            population+=BirthsPerYear;
            population-=DeathsPerYear;
            population+=ImigrantsPerYear;
            System.out.print("Year "+i+": ");
            System.out.printf("%.0f\n",population);
        }
    }
}
