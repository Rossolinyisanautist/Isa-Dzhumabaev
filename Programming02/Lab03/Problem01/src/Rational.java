class Rational {
    private int numerator;
    private int denominator;

    Rational(int numerator, int denominator){
        if(denominator == 0)
            throw new ArithmeticException("Denominator can not be equal to zero: ");
        this.numerator = numerator;
        this.denominator = denominator;
    }
    Rational add(Rational second){
        int newNumerator = numerator * second.denominator + second.numerator * denominator;
        int newDenominator = denominator * second.denominator;
    return new Rational(newNumerator, newDenominator);
    }

    Rational subtract(Rational second){
        int newNumerator = numerator * second.denominator - second.numerator * denominator;
        int newDenominator = denominator * second.denominator;
    return new Rational(newNumerator, newDenominator);
    }

    Rational multiply(Rational second){
        int newNumerator = numerator * second.numerator;
        int newDenominator = denominator * second.denominator;
    return new Rational(newNumerator, newDenominator);
    }

    Rational divide(Rational second){
        int newNumerator = numerator * second.denominator;
        int newDenominator = denominator * second.numerator;
    return new Rational(newNumerator, newDenominator);
    }

    Rational simplify(){
        int a = numerator;
        int b = denominator;
        while (a != 0 && b != 0){
            if(a > b){
                a %= b;
            }
            else{
                b %= a;
            }
        }
        int gcd = a + b;
        numerator /= gcd;
        denominator /= gcd;
        return new Rational(numerator, denominator);
    }

    static Rational parseRational(String input){
        String[] parts = input.split("/");
        if(parts.length == 0 || parts.length > 2)
            throw new IllegalArgumentException("Incorrect rational: " + input);
        try{
            int n, d;
            n = Integer.parseInt(parts[0]);
            d = parts.length == 1 ? 1 : Integer.parseInt(parts[1]);

            return new Rational(n, d);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Incorrect rational: " + input);
        }
    }

    public String toString(){
        return numerator + "/" + denominator;
    }
    int compareTo(Rational second){
        int a = numerator * second.denominator;
        int b = denominator * second.numerator;
        return Integer.compare(a, b);
    }
}
