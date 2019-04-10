public class Main {
    public static void main(String[] args) {
        float population = 312032486f;
        float BirthsPerYear = 1.0f/7*60*60*24*365;
        float DeathsPerYear = 1.0f/13*60*60*24*365;
        float ImigrantsPerYear = 1.0f/45*60*60*24*365;

        for(int i = 1 ; i<=5;i++){
            population+=BirthsPerYear;
            population-=DeathsPerYear;
            population+=ImigrantsPerYear;
            System.out.print("Year "+i+": ");
            System.out.printf("%.1f\n",population);
        }

    }
}
