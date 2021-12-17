import java.io.IOException;
import java.util.Scanner;

public class P1329 {
 
    public static void main (String[] args) throws IOException {

        Scanner sc = new Scanner (System.in);        

        while (true){
            int N = sc.nextInt();         
            if (N==0){
                break;

            }  

            // declarando um contador para mary e para jhon
            int mary = 0;
            int jhon = 0;
            //loop de N vezes
            for (int i = 0; i < N; i++){

                //lendo a entrada
                int resultado = sc.nextInt();

                //quando a entrada for igual a 0, incrementar o contador mary
                if (resultado == 0){
                    mary=mary+1;//mary++
                }

                //quando a entrada for igual a 1, incrementar o contador jhon
                if (resultado == 1){
                    jhon=jhon+1;//jhon++

                }

            }
        //imprimindo a saída
        System.out.println("Mary won " + mary + " times and John won " + jhon + " times");

        }

    }
 
}
