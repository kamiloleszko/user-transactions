package pl.koleszko.software.usertransactions.apiweb;

import org.springframework.context.annotation.Import;
import pl.koleszko.software.usertransactions.apisample.ApiSampleContext;
import pl.koleszko.software.usertransactions.domainsamples.DomainSamplesContext;
import pl.wavesoftware.sampler.spring.SpringSamplerAutoConfiguration;

@Import({
        DomainSamplesContext.class,
        ApiSampleContext.class,
        SpringSamplerAutoConfiguration.class
})
public class ApiWebUnitContext {
}
