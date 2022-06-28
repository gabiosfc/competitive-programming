import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int menorNumero(int f1, int f2){
        if(f1 < f2){
            return f1;
        } 
        return f2;
    }

    public static int maiorNumero(int f1, int f2){
        if(f1 > f2){
            return f1;
        } 
        return f2;
    }

    public static int maiorDivisorComum(int menor, int maior){
        if(maior % menor == 0){
            return menor;
        }

        for(int i = (menor/2)+1; i > 1; i--) {
            if((menor %i == 0) && (maior %i == 0)) {
                return i;
            }
        }

        return 1;

    }

    public static int mdcEuclides(int menor, int maior){
        if(menor == 0) return maior;
        return mdcEuclides(maior%menor, menor);
    }

    public static void imprimeEntrada(){
        for(int i =0; i< 3000; i++){
            System.out.println("1000 999");
        }
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();

        
        for(int i = 0; i < n; i++){
            int f1 = sc.nextInt();
            int f2 = sc.nextInt(); 

            int menor = menorNumero(f1, f2);
            int maior = maiorNumero(f1, f2);


            //int qtdPilha = maiorDivisorComum(menor, maior);
            int qtdPilha = mdcEuclides(menor, maior);


            System.out.println(qtdPilha);          
        }
        
    }
 
}