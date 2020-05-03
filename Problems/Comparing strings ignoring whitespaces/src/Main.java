import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String exitFirst = first.replace(" ", "");
        String exitSecond = second.replace(" ", "");
        System.out.println(exitFirst.equals(exitSecond));

    }
}