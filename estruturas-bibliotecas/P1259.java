import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class P1259 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            int resultado = sc.nextInt();
            lista.add(resultado);


//            ArrayList<int> pares = new ArrayList<>();
//            pares.add(resultado);
//
//            ArrayList<int> impares = new ArrayList<>();
//            impares.add(resultado);

        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }

    }

}

