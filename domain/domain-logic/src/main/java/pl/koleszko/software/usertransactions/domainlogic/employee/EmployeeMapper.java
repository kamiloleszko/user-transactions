package pl.koleszko.software.usertransactions.domainlogic.employee;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.koleszko.software.usertransactions.domainmodel.employee.AddEmployeeCommand;
import pl.koleszko.software.usertransactions.domainmodel.employee.Employee;

@Mapper
public interface EmployeeMapper {

    @Mapping(target = "employeeId", ignore = true)
    @Mapping(target = "modificationDate", ignore = true)
    @Mapping(target = "creationDate", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    Employee mapToEntity(AddEmployeeCommand command);
}
