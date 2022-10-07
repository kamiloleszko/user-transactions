package pl.koleszko.software.usertransactions.infrastructure.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;
import pl.koleszko.software.usertransactions.domainmodel.employee.Employee;
import pl.koleszko.software.usertransactions.domainmodel.employee.EmployeeException;
import pl.koleszko.software.usertransactions.domainmodel.employee.EmployeeRepository;

import static lombok.AccessLevel.PACKAGE;
import static org.apache.commons.lang3.StringUtils.SPACE;
import static org.apache.commons.lang3.StringUtils.strip;
import static pl.koleszko.software.usertransactions.domainmodel.employee.EmployeeExceptionCode.EMPLOYEE_ALREADY_EXISTS;

@Repository
@RequiredArgsConstructor(access = PACKAGE)
class EmployeeRepositoryImpl implements EmployeeRepository {

    private final EmployeeDao dao;

    @Override
    public void save(Employee employee) {
        try {
            dao.insert(employee);
        } catch (DataIntegrityViolationException exception) {
            throw new EmployeeException(EMPLOYEE_ALREADY_EXISTS, getFullName(employee));
        }
    }

    private String getFullName(Employee employee) {
        return strip(employee.getFirstName().toUpperCase().trim() + SPACE +  employee.getLastName().toUpperCase().trim());
    }
}
