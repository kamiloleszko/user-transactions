package pl.koleszko.software.usertransactions.apisample;

import org.springframework.context.annotation.ComponentScan;
import pl.wavesoftware.sampler.spring.Sample;

@ComponentScan(
        includeFilters = @ComponentScan.Filter(Sample.class),
        useDefaultFilters = false
)
public class ApiSampleContext {
}
