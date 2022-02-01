import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class P1005 {

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner (System.in);
        DecimalFormat deci = new DecimalFormat("0.00000");

        String A = scanner.nextLine();
        String B = scanner.nextLine();


        double resultA = Double.parseDouble(A.replace("," , "."));
        double resultB = Double.parseDouble(B.replace("," , "."));

        double result = ((resultA*3.5)/11) + ((resultB*7.5)/11);

        String resultString = "" + deci.format(result);

        System.out.println("MEDIA = " + resultString.replace(",", "."));

    }

}



        
