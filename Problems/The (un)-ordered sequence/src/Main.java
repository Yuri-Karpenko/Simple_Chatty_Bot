import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sorted = true;
        int first = scanner.nextInt();
        int next;
        while (scanner.hasNext()) {
            next = scanner.nextInt();
            if (next == 0) {
                break;
            }
            if (next == first) {
                first = next;
                continue;
            } else if (first > next) {
                first = next;
                while (scanner.hasNext()) {
                    next = scanner.nextInt();
                    if (next == 0) {
                        break;
                    }
                    if (next == first) {
                        first = next;
                        continue;
                    } else if (first > next) {
                        first = next;
                        continue;
                    } else {
                        sorted = false;
                    }
                }
            } else {
                first = next;
                while (scanner.hasNext()) {
                    next = scanner.nextInt();
                    if (next == 0) {
                        break;
                    }
                    if (next == first) {
                        first = next;
                        continue;
                    } else if (first < next) {
                        first = next;
                        continue;
                    } else {
                        sorted = false;
                    }
                }
            }
        }
        System.out.println(sorted);
    }
}