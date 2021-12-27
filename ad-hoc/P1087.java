import java.io.IOException;
import java.util.Scanner;

public class P1087 {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int result = 0;

        while (true) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if (x1 == 0 &&
                y1 == 0 &&
                x2 == 0 &&
                y2 == 0) break;

            int xmod = Math.abs (x2 - x1);
            int ymod = Math.abs (y2 - y1);

            if (x1 == x2 &&
                y1 == y2) {
                result = 0;

            } else if (x1 == x2 ||
                    y1 == y2 ||
                    xmod == ymod) {
                result = 1;
            }

            else{
                result = 2;

            }

            System.out.println(+result);
        }

    }

}
