import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busH = scanner.nextInt();
        int countB = scanner.nextInt();
        int i = 0;
        int numCrush = 0;
        boolean crush = false;
        while (i != countB) {
            int bridgeH = scanner.nextInt();
            i++;

            if (bridgeH <= busH && crush == false) {
                crush = true;
                numCrush = i;

            }
        }


        if (crush == true) {
            System.out.println("Will crash on bridge " + numCrush);
        } else {
            System.out.println("Will not crash");
        }

    }
}
