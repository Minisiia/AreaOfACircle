import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть r");
        double r = scanner.nextDouble();
        double S = PI * Math.pow(r, 2);
        System.out.println("Площа кола " + S);

    }
}
