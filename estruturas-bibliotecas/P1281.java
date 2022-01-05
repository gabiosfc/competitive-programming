import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1281 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            //Declarando a variável listaFeira do tipo lista de Feira (a qual foi definida na classe Feira)
            ArrayList<Feira> listaFeira = new ArrayList<>();

            int M = sc.nextInt();
            
            for (int j = 0; j < M; j++) {

                //Declarando a variável bi do tipo BufferedReader
                BufferedReader bi = new BufferedReader(
                    new InputStreamReader(System.in));

                //Declarando a variável strNums do tipo String[] (mesma coisa que um vetor de string)
                String[] strNums;
                //Lê a entrada e quebra por espaço atribuindo cada posição no vetor
                strNums = bi.readLine().split(" ");

                //Declarando a variável feira do tipo Feira
                Feira feira = new Feira();
                //Atribuindo nome para o conteúdo que se encontra na posição 0 do vetor
                feira.nome = strNums[0];
                // Atribuindo preco para o conteúdo que se encontra na posição 1 do vetor, e fazendo a conversão de string para float
                feira.preco = Float.parseFloat(strNums[1]);
                feira.quantidade = 0;

                //Adicionando objetos dentro da lista listaFeira
                listaFeira.add(feira);            
            
            }


            int P = sc.nextInt();

            for (int k = 0; k < P; k++) {
            
                BufferedReader bi = new BufferedReader(
                    new InputStreamReader(System.in));

                String[] strNums;
                strNums = bi.readLine().split(" ");

                Feira feira = new Feira();
                feira.nome = strNums[0];
                feira.quantidade = Integer.parseInt(strNums[1]);


                    for (int l = 0; l < listaFeira.size(); l++) {
                        if (feira.nome.equals(listaFeira.get(l).nome)){
                            listaFeira.get(l).quantidade = feira.quantidade;
                        }

                    }

                //System.out.println(feira.nome + " " + feira.quantidade);

            }

            float resultado = 0;
           
            //Percorrendo a lista inteira e imprimindo o conteúdo de cada posição
            for (int l = 0; l < listaFeira.size(); l++) {
                resultado = resultado + listaFeira.get(l).preco*listaFeira.get(l).quantidade;

            }

            System.out.printf("R$ " + "%.2f",resultado);
            System.out.println("");


        }

    }

}

class Feira {
    
    public String nome; 
    public Float preco;
    public Integer quantidade;

}

