import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int upPerDay = scanner.nextInt();
        int downPerNight = scanner.nextInt();

        
        System.out.println(1 + (height - downPerNight - 1) / (upPerDay - downPerNight));

    }
}
