package pl.koleszko.software.usertransactions.domainmodel.employee;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
@Builder
public class AddEmployeeCommand {

    @NotBlank
    String firstName;

    @NotBlank
    String lastName;
}
