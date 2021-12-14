import java.io.IOException;
import java.util.Scanner;

public class P1153 {
 
    public static void main (String[] args) throws IOException {


        Scanner sc = new Scanner (System.in);        
        
        int N = sc.nextInt();

        System.out.println("N = " + N);

        int resultado = 1;


        for (int i = 1; i <= N; i++){
             resultado = resultado*i;

             System.out.println("i = " + i + "; res = " + resultado);     

        }

    }
 
}
        
        
