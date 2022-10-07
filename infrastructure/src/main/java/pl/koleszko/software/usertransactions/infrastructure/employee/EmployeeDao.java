package pl.koleszko.software.usertransactions.infrastructure.employee;

import org.springframework.data.repository.CrudRepository;
import pl.koleszko.software.usertransactions.domainmodel.employee.Employee;
import pl.koleszko.software.usertransactions.domainmodel.shared.annotation.Dao;

@Dao
public interface EmployeeDao extends CrudRepository<Employee, Long>, EmployeeCustomDao {
}
