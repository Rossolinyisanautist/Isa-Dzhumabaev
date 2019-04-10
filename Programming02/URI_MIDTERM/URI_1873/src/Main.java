import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // which weapon is stronger:
        final String  rock = "pedra",       //rock  < paper, spock
                      paper = "papel",      //paper < scissors, lizard
                      scissors = "tesoura", //scissors < rock, spock
                      spock = "spock",      //spock < lizard, paper
                      lizard = "lagarto";   //lizard < rock, scissors

        int n = sc.nextInt();
        while (n-- > 0){
            String rajesh = sc.next(),
                   sheldon = sc.next(),
                   result = "rajesh";

            if(!rajesh.equals(sheldon))     // check if it is not a draw
                switch (rajesh){
                    case rock:
                        if(sheldon.equals(paper) || sheldon.equals(spock))
                            result = "sheldon";
                        break;
                    case paper:
                        if(sheldon.equals(scissors) || sheldon.equals(lizard))
                            result = "sheldon";
                        break;
                    case scissors:
                        if(sheldon.equals(rock) || sheldon.equals(spock))
                            result = "sheldon";
                        break;
                    case spock:
                        if(sheldon.equals(lizard) || sheldon.equals(paper))
                            result = "sheldon";
                        break;
                    case lizard:
                        if(sheldon.equals(rock) || sheldon.equals(scissors))
                            result = "sheldon";
                        break;
                }
            else
                result = "empate";
            System.out.println(result);
        }
    }
}
/*
  Scissors > paper > rock > lizard > spock > scissors

  Scissors > paper

• Paper > rock

• Rock > scissors

• Scissors > lizard
• Spock > scissors

• lizard > paper
• Paper > spock

• Spock > rock
• Rock > lizard

• Lizard > Spock

*/
