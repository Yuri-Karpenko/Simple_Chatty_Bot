import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] res = input.toCharArray();
        if (res[0] == res[3] && res[1] == res[2]) {
            System.out.println(1);
        } else {
            System.out.println(res[0] + res[1] + res[2] + res[3]);
        }
    }
}