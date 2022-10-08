package pl.koleszko.software.usertransactions.apiweb.configuration;

import com.github.springtestdbunit.bean.DatabaseConfigBean;
import com.github.springtestdbunit.bean.DatabaseDataSourceConnectionFactoryBean;
import org.dbunit.dataset.datatype.DefaultDataTypeFactory;
import org.dbunit.ext.h2.H2DataTypeFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties
@ComponentScan({"pl.koleszko.software.usertransactions"})
public class DbUnitTestConfig {

    @Bean
    DefaultDataTypeFactory dbUnitDataTypeFactory() {
        return new H2DataTypeFactory();
    }

    @Bean
    DatabaseConfigBean dbUnitDatabaseConfigBean() {
        DatabaseConfigBean bean = new DatabaseConfigBean();
        bean.setDatatypeFactory(dbUnitDataTypeFactory());
        return bean;
    }

    @Bean
    DatabaseDataSourceConnectionFactoryBean dbUnitDatabaseConnection(DataSource dataSource) {
        DatabaseDataSourceConnectionFactoryBean bean = new DatabaseDataSourceConnectionFactoryBean();
        bean.setDatabaseConfig(dbUnitDatabaseConfigBean());
        bean.setDataSource(dataSource);
        return bean;
    }
}
