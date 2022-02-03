import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class DownloadPDF {

    public static void main(String[] args) throws IOException {

        try (BufferedInputStream in = new BufferedInputStream(new URL("https://www.orimi.com/pdf-test.pdf").openStream());
             FileOutputStream fileOutputStream = new FileOutputStream("/tmp/myFile.pdf")) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            // handle exception
        }
    }
}