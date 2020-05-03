import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digi;
        int sum = -1;

        do {
            digi = scanner.nextInt();
            sum = sum + 1;
        } while (digi != 0);


        System.out.println(sum);

    }
}