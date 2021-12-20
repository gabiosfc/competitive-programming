import java.io.IOException;
import java.util.Scanner;

public class P1103 {
 
    public static void main (String[] args) throws IOException {


        Scanner sc = new Scanner (System.in);        

        while (true){
            int H1 = sc.nextInt();
            int M1 = sc.nextInt();
            int H2 = sc.nextInt();
            int M2 = sc.nextInt();

            if (H1==0 &&
                M1==0 &&
                H2==0 &&
                M2==0){
                break;
            }  

            int hora1 = getHora(H1, M1);
            int hora2 = getHora(H2, M2);

            if (hora2 >= hora1){
                System.out.println(hora2-hora1);
            } 
            else { 
                System.out.println(hora2-hora1+1440);
            }
           
        }

    }

    private static int getHora(int H, int M) {
        return (H * 60) + M;
    }

}
