package pl.koleszko.software.usertransactions.apishared.employee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class AddEmployeeRequest {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;
}
