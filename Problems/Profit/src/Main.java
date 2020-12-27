import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();
        int years = 0;
        while (m < k) {
            m *= 1 + p / 100;
            years++;
        }
        System.out.println(years);
    }
}