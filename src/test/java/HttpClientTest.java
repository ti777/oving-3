import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class HttpClientTest {
    @Test
    void shouldGetSuccessfulResponseCode() throws IOException {
        HttpClient client = new HttpClient("httpbin.org", 80, "/html");
        assertEquals(200, client.getStatusCode());
    }

    @Test
    void shouldGetFailureResponseCode() throws IOException {
        HttpClient client = new HttpClient("httpbin.org", 80, "/status/403");
        assertEquals(401, client.getStatusCode());
    }

}
