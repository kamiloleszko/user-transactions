package pl.koleszko.software.usertransactions.domainmodel.shared.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface Factory {

    String value() default "";
}
