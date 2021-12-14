import java.io.IOException;
import java.util.Scanner;
 
public class calculadora {
 
    public static void main(String[] args) throws IOException {
 
      
        
        Scanner sc = new Scanner (System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        char operador = sc.next().charAt(0);
        
        if (operador == '+') {
            System.out.println(A+B);
        } else if (operador == '-'){
            System.out.println(A-B);
        } else if (operador == '*'){
            System.out.println(A*B);
        } else if (operador == '/'){
            System.out.println(A/B);
        }

    }
 
}
