public class Main {
    public static void main(String[] args) {
        double d = 0.1;
        double sum = 0;
        for (int i = 0; i < 10; i++){
            sum += d;
        }
        if(sum == 1)
            System.out.println("Equal to 1");
        else
            System.out.println("Not equal to 1");
        System.out.println("Sum is " + sum);
    }
}