import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durations = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int oneWayCost = scanner.nextInt();
        int oneNightCost = scanner.nextInt();
        System.out.println(durations * foodPerDay + (durations - 1) * oneNightCost + oneWayCost * 2);
    }
}
