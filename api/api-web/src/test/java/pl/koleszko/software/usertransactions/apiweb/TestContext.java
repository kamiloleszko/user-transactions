package pl.koleszko.software.usertransactions.apiweb;

import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static lombok.AccessLevel.PACKAGE;

@SpringBootApplication(
        scanBasePackageClasses = {
                TestContext.class
        }
)
@NoArgsConstructor(access = PACKAGE)
public class TestContext {

    public static String apiUrlBasePath(int port) {
        return "http://127.0.0.1:" + port + "/api/user-transactions";
    }
}
