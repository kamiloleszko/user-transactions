package pl.koleszko.software.usertransactions.apisample;

import org.springframework.boot.test.web.client.TestRestTemplate;
import pl.koleszko.software.usertransactions.domainmodel.shared.annotation.Factory;

@Factory
public class TestRestTemplateFactory {

    public TestRestTemplate createTemplate() {
        return new TestRestTemplate();
    }
}
