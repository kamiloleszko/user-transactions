package pl.koleszko.software.usertransactions.domainlogic.employee;

import org.springframework.validation.annotation.Validated;
import pl.koleszko.software.usertransactions.domainmodel.employee.AddEmployeeCommand;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
public interface EmployeeService {

    void addEmployee(@Valid @NotNull AddEmployeeCommand command);
}
