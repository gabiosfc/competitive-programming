import java.io.IOException;
import java.util.Scanner;

public class P1387 {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner (System.in);

        while (true){
            int L = sc.nextInt();
            int R = sc.nextInt();
            if (L==0 &&
                R==0){
                break;

            }

            int resultado = (L+R);

           System.out.println(+resultado);

        }

    }

}

