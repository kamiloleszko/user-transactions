package pl.koleszko.software.usertransactions.configuration;

import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@EnableAutoConfiguration(
        exclude = {

                SecurityAutoConfiguration.class,
                ManagementWebSecurityAutoConfiguration.class
        }
)
class MainConfiguration {
}
