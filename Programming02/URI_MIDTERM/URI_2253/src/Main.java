
// OMG WHAT I BULLSHIT. TOTAL BULLSHIT
// Main2 IS MUCH BETTER
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            String password = sc.nextLine();
            boolean hasValidLength = password.length() >= 6 && password.length() <= 32;
            boolean hasLowerCase = false;
            boolean hasUpperCase = false;
            boolean hasDigit = false;
            boolean hasNoSymbols = true;

            for(int i = 0; i < password.length(); i++){
                if(!Character.isLetter(password.charAt(i)) &&
                        !Character.isDigit(password.charAt(i))){
                    hasNoSymbols = false;
                    break;
                }
                if(Character.isLowerCase(password.charAt(i))){
                    hasLowerCase = true;
                }
                if(Character.isUpperCase(password.charAt(i))){
                    hasUpperCase = true;
                }
                if(Character.isDigit(password.charAt(i))){
                    hasDigit = true;
                }
            }
            if(hasDigit && hasLowerCase && hasUpperCase &&
                    hasNoSymbols && hasValidLength){
                System.out.println("Senha valida.");
            }
            else {
                System.out.println("Senha invalida.");
            }
        }while (sc.hasNext());
    }
}/*
URI Online Judge
AbcdEfgh99
URIOnlineJudge12
URI Online Judge 12
Aass9
Aassd9

Senha invalida.
Senha valida.
Senha valida.
Senha invalida.
Senha invalida.
Senha valida.
*/