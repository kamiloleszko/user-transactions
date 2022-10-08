package pl.koleszko.software.usertransactions.apiweb.employee;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import pl.koleszko.software.usertransactions.apisample.employee.SampleAddEmployeeRequest;
import pl.koleszko.software.usertransactions.apishared.employee.AddEmployeeRequest;
import pl.koleszko.software.usertransactions.apiweb.BaseIntegrationTest;

import static com.github.springtestdbunit.annotation.DatabaseOperation.DELETE_ALL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.springframework.http.HttpStatus.CREATED;
import static pl.koleszko.software.usertransactions.apiweb.TestContext.apiUrlBasePath;

class EmployeeRestResourceIT extends BaseIntegrationTest {

    private static final String ADD_EMPLOYEE_URL = "/employee";

    @Test
    @DatabaseSetup(value = "/dbunit/employee/employee_init.xml", type = DELETE_ALL)
    @DisplayName("Should save new employee")
    void should_save_new_employee() {
        //given
        AddEmployeeRequest request = samplerContext.get(SampleAddEmployeeRequest.class);

        //when
        ResponseEntity<String> response = testRestTemplateFactory
                .createTemplate()
                .postForEntity(apiUrlBasePath(port) + ADD_EMPLOYEE_URL, request, String.class);

        //then
        assertEquals(response.getStatusCode(), CREATED);
        assertNull(response.getBody());
    }

    //TODO add when advise controller is ready

//    @Test
    @DatabaseSetup(value = "/dbunit/employee/employee_init.xml", type = DELETE_ALL)
    @DisplayName("Should save new employee")
    void should_return_exception_when_employee_already_exists() {
        //given
        AddEmployeeRequest request = samplerContext.get(SampleAddEmployeeRequest.class);

        //when
        ResponseEntity<String> response = testRestTemplateFactory
                .createTemplate()
                .postForEntity(apiUrlBasePath(port) + ADD_EMPLOYEE_URL, request, String.class);

        //then
        //TODO -> exception
    }
}
