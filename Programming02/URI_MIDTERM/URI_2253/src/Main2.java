import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            String password = sc.nextLine();
            boolean hasValidLength = password.length() >= 6 && password.length() <= 32,
                    hasLowerCase, hasUpperCase, hasDigit, hasNoSymbols;

            hasUpperCase = password.matches("(.*)[A-Z](.*)"); // !password.equals(password.toLowerCase());
            hasLowerCase = password.matches("(.*)[a-z](.*)"); // !password.equals(password.toUpperCase());
            hasDigit = password.matches("(.*)[0-9](.*)");
            hasNoSymbols = password.matches("[A-Za-z0-9]*") && !password.contains(" ");

            password = (hasValidLength && hasUpperCase &&
                        hasLowerCase && hasDigit &&
                        hasLowerCase && hasNoSymbols) ? "Senha valida." : "Senha invalida.";

            System.out.println(password);
        }while (sc.hasNext());
    }
}