import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; n > 0; i++) {
            for (int k = i; k > 0; k--) {
                System.out.print(i + " ");
                n--;
                if (n == 0) {
                    break;
                }
            }
        }
    }
}