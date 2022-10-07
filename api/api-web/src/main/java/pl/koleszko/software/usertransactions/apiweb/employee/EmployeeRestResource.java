package pl.koleszko.software.usertransactions.apiweb.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.koleszko.software.usertransactions.apishared.annotation.RestResource;
import pl.koleszko.software.usertransactions.apishared.employee.AddEmployeeRequest;
import pl.koleszko.software.usertransactions.apishared.employee.EmployeeRestMapper;
import pl.koleszko.software.usertransactions.domainlogic.employee.EmployeeService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import static org.springframework.http.HttpStatus.CREATED;

@RestResource
@RequestMapping(path = "/employee")
@RequiredArgsConstructor
public class EmployeeRestResource {

    private final EmployeeService service;
    private final EmployeeRestMapper mapper;

    @PostMapping
    public ResponseEntity addEmployee(@RequestBody @Valid @NotNull AddEmployeeRequest request) {
        service.addEmployee(
                mapper.map(request)
        );
        return ResponseEntity
                .status(CREATED)
                .build();
    }
}
