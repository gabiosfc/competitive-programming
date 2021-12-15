import java.io.IOException;
import java.util.Scanner;

public class P1103 {
 
    public static void main (String[] args) throws IOException {


        Scanner sc = new Scanner (System.in);        

        int resultado = 1;

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

            if (((H2*60)+M2)>=((H1*60)+M1)){
                System.out.println(((H2*60)+M2)-((H1*60)+M1));
            } 
            else { 
                System.out.println(((H2*60)+M2)-((H1*60)+M1)+1440);
            }
           
        }

    }
 
}
