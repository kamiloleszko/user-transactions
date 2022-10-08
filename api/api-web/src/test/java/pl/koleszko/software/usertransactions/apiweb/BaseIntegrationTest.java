package pl.koleszko.software.usertransactions.apiweb;

import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;
import pl.koleszko.software.usertransactions.apisample.TestRestTemplateFactory;
import pl.koleszko.software.usertransactions.apiweb.configuration.DbUnitTestConfig;
import pl.koleszko.software.usertransactions.apiweb.configuration.DbUnitTestSetup;
import pl.wavesoftware.sampler.api.SamplerContext;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@DbUnitConfiguration
@DbUnitTestSetup
@SpringBootTest(classes = DbUnitTestConfig.class,webEnvironment = RANDOM_PORT)
@ContextConfiguration(classes = ApiWebUnitContext.class)
public class BaseIntegrationTest {

    @LocalServerPort
    protected Integer port;

    @Autowired
    protected SamplerContext samplerContext;

    @Autowired
    protected TestRestTemplateFactory testRestTemplateFactory;

}
