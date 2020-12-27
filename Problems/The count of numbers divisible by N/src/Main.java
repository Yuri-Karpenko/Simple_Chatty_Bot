import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= (b - a); i++) {
            if ((a + i) % n == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}