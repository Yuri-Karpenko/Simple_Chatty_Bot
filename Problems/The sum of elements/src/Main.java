import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            if (i != 0) {
                sum += i;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}
