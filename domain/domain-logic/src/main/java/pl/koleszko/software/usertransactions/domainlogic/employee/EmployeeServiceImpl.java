package pl.koleszko.software.usertransactions.domainlogic.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.koleszko.software.usertransactions.domainmodel.employee.AddEmployeeCommand;
import pl.koleszko.software.usertransactions.domainmodel.employee.EmployeeRepository;

import static lombok.AccessLevel.PACKAGE;

@Service
@RequiredArgsConstructor(access = PACKAGE)
class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;
    private final EmployeeMapper mapper;

    @Override
    public void addEmployee(AddEmployeeCommand command) {
        repository.save(
                mapper.mapToEntity(command)
        );
    }
}
