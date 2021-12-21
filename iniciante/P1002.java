import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1002 {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner (System.in);
        DecimalFormat deci = new DecimalFormat("0.0000");

        double N = sc. nextDouble();
        double pi = (3.14159);
        double result = (pi * (N * N));

        System.out.println("A=" + deci.format(result));
    }
 
}
