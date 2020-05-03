import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        var a = num / 100;
        var b = num % 100;
        var c = b / 10;
        var d = b % 10;
        System.out.println(a + c + d);
    }
}
