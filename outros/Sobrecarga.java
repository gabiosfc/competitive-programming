import java.io.IOException;

public class Sobrecarga {

    public static int soma(int a, int b) {
     
        return a+b;

    }

    public static float soma(int a, float b) {

        return a+b+1;

    }

    public static int soma(int a, int b, int c) {

        return a+b+c;

    }

    public static void main(String[] args) throws IOException {

        System.out.println(soma(1, (float) 2.1));
        System.out.println(soma(3,5));
        System.out.println(soma(2,4,6));


    }
 
}


