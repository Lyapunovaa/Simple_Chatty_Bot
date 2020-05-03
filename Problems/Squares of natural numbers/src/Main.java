import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sqr = 1;


        for (int i = 1; sqr <= n; i++) {
            sqr = i * i;
            if (sqr <= n) {
                System.out.println(sqr);
            }
        }


    }
}



