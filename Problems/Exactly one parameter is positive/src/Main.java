import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean pair1 = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean pair2 = num1 <= 0 && num2 > 0 && num3 <= 0;
        boolean pair3 = num1 <= 0 && num2 <= 0 && num3 > 0;
        boolean fin = pair1 || pair2 || pair3;
        System.out.println(fin);

    }
}