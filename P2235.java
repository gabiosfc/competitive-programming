import java.io.IOException;
import java.util.Scanner;

public class P2235 {
 
    public static void main (String[] args) throws IOException {


        Scanner sc = new Scanner (System.in);        
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        if ((A==B) ||
            (A==C) ||
            (B==C) ||
            (A+B==C) ||
            (B+C==A) ||
            (A+C==B) ||
            (A-B==C) ||
            (A-C==B) ||
            (B-A==C) ||
            (B-C==A) ||
            (C-A==B) ||
            (C-B==A)
        ) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
         

    }
 
}
        
        
