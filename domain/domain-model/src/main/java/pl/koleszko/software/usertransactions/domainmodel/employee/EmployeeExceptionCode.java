package pl.koleszko.software.usertransactions.domainmodel.employee;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pl.koleszko.software.usertransactions.domainmodel.exception.ExceptionCode;

@Getter
@RequiredArgsConstructor
public enum EmployeeExceptionCode implements ExceptionCode {

    EMPLOYEE_ALREADY_EXISTS("EMPLOYEE_ALREADY_EXISTS", "Employee: {0} already exists");

    private final String name;
    private final String message;
}
