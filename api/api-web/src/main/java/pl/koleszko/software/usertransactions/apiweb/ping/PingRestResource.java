package pl.koleszko.software.usertransactions.apiweb.ping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.koleszko.software.usertransactions.apishared.annotation.RestResource;

@RestResource
@RequestMapping("/ping")
public class PingRestResource {

    @GetMapping
    public String ping() {
        return "Application works.";
    }
}
