package pl.koleszko.software.usertransactions.apishared.employee;

import org.mapstruct.Mapper;
import pl.koleszko.software.usertransactions.domainmodel.employee.AddEmployeeCommand;

@Mapper
public interface EmployeeRestMapper {

    AddEmployeeCommand map(AddEmployeeRequest request);
}
