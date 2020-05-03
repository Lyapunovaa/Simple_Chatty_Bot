import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int large = 0;
        int smaller = 0;
        int ready = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int input = scanner.nextInt();
            if (input == -1) {
                smaller = smaller + 1;
            } else if (input == 1) {
                large = large + 1;
            } else if (input == 0) {
                ready = ready + 1;
            }
        }
        System.out.println(ready + " " + large + " " + smaller);

    }
}