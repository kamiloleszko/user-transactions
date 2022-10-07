package pl.koleszko.software.usertransactions.infrastructure.employee;

import pl.koleszko.software.usertransactions.domainmodel.employee.Employee;

public interface EmployeeCustomDao {

    void insert(Employee employee);
}
