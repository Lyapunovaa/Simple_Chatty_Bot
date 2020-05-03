import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long res = 1;
        for (; a < b; a++) {
            res = res * a;
        }
        System.out.println(res);
    }
}