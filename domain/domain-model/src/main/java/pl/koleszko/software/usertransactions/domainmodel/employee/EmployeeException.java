package pl.koleszko.software.usertransactions.domainmodel.employee;

import pl.koleszko.software.usertransactions.domainmodel.exception.BusinessException;
import pl.koleszko.software.usertransactions.domainmodel.exception.ExceptionCode;

public class EmployeeException extends BusinessException {

    private static final long serialVersionUID = 3303070197594364001L;

    public EmployeeException(ExceptionCode exceptionCode, String... arguments) {
        super(exceptionCode, arguments);
    }
}
