import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int pyat = 0;
        int chet = 0;
        int tri = 0;
        int dva = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int mark = scanner.nextInt();
            if (mark == 5) {
                pyat = pyat + 1;
            } else if (mark == 4) {
                chet = chet + 1;
            } else if (mark == 3) {
                tri = tri + 1;
            } else if (mark == 2) {
                dva = dva + 1;
            }
        }
        System.out.println(dva + " " + tri + " " + chet + " " + pyat);

    }
}
