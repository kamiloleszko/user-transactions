package pl.koleszko.software.usertransactions.apisample.employee;

import pl.koleszko.software.usertransactions.apishared.employee.AddEmployeeRequest;
import pl.wavesoftware.sampler.api.Sampler;
import pl.wavesoftware.sampler.spring.Sample;

import static pl.koleszko.software.usertransactions.domainsamples.constants.Employee.EMPLOYEE_FIRST_NAME;
import static pl.koleszko.software.usertransactions.domainsamples.constants.Employee.EMPLOYEE_LAST_NAME;

@Sample
public class SampleAddEmployeeRequest implements Sampler<AddEmployeeRequest> {
    @Override
    public AddEmployeeRequest create() {
        AddEmployeeRequest request = new AddEmployeeRequest();
        request.setFirstName(EMPLOYEE_FIRST_NAME);
        request.setLastName(EMPLOYEE_LAST_NAME);
        return request;
    }
}
