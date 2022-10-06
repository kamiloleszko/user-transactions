package pl.koleszko.software.usertransactions.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({
        "pl.koleszko.software.usertransactions",
        "pl.koleszko.software.usertransactions.apiweb",
        "pl.koleszko.software.usertransactions.infrastructure",
        "pl.koleszko.software.usertransactions.domainmodel",
        "pl.koleszko.software.usertransactions.domainlogic"
})
@SpringBootApplication
public class AppMain {

    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);
    }
}
