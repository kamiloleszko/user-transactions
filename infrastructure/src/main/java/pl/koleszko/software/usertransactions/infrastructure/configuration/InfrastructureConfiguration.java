package pl.koleszko.software.usertransactions.infrastructure.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan({"pl.koleszko.software.usertransactions.domainmodel"})
@EnableJpaRepositories({"pl.koleszko.software.usertransactions.infrastructure"})
class InfrastructureConfiguration {
}
