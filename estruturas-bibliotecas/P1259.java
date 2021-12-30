import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class P1259 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            int resultado = sc.nextInt();

            if (resultado %2 == 0) {
                pares.add(resultado);
            }

            else { 
                impares.add(resultado);

            }

        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());


        for (int i = 0; i < pares.size(); i++) {
            System.out.println(pares.get(i));

        }

        for (int i = 0; i < impares.size(); i++) {
            System.out.println(impares.get(i));

        }

    }

}

