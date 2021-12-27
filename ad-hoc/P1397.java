import java.io.IOException;
import java.util.Scanner;

public class P1397 {

    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner (System.in);

        while (true){
            int N = sc.nextInt();         
            if (N==0){
                break;

            }  

            int cont_A = 0;
            int cont_B = 0;

            for (int i = 0; i < N; i++){

                int A = sc.nextInt();
                int B = sc.nextInt();

                if (A>B){
                    cont_A = cont_A+1;
                }

                else if (B>A){
                    cont_B = cont_B+1;

                }

            }

        System.out.println(cont_A + " " + cont_B);

        }

    }
 
}
