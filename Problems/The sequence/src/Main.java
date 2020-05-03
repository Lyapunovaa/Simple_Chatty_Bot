import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int global = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + i + " ");
                global += 1;
                if (global == n) {
                    break;
                }
            }
            if (global == n) {
                break;
            }
        }


    }
}
