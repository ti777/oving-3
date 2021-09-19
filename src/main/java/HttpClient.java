import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.HashMap;

public class HttpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("httpbin.org", 80);
        String request = "GET /html HTTP/1.1\r\n" +
                "Host: httpbin.org\r\n" +
                "Connection: keep-alive\r\n" +
                "Cache-Control: max-age=0\r\n" +
                "Upgrade-Insecure-Requests: 1\r\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.82 Safari/537.36\r\n" +
                "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\r\n" +
                "Accept-Language: nb-NO,nb;q=0.9,no;q=0.8,nn;q=0.7,en-US;q=0.6,en;q=0.5\r\n";

        socket.getOutputStream().write(request.getBytes());

        int c;
        while ((c = socket.getInputStream().read()) != -1) {
            System.out.print((char) c);
        }
    }




}
