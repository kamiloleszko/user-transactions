package pl.koleszko.software.usertransactions.apiweb.ping;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import pl.koleszko.software.usertransactions.apiweb.BaseIntegrationTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.HttpStatus.OK;
import static pl.koleszko.software.usertransactions.apiweb.TestContext.apiUrlBasePath;

class PingRestResourceIT extends BaseIntegrationTest {

    private static final String PING_URL = "/ping";

    @Test
    void test() {
        //when

        //when
        ResponseEntity<String> response = pingApplication();

        //then
        assertEquals(response.getStatusCode(), OK);
        assertEquals(response.getBody(), "Application works.");
    }

    private ResponseEntity<String> pingApplication() {
        return testRestTemplateFactory
                .createTemplate()
                .getForEntity(apiUrlBasePath(port) + PING_URL,  String.class);
    }
}
