import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String age = scanner.next();
        String stage = scanner.next();
        String exp = scanner.next();
        String kitch = scanner.next();


        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef that cooks "
                + kitch + " dishes.");


    }
}