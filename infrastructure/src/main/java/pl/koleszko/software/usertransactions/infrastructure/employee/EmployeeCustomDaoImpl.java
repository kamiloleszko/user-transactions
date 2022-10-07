package pl.koleszko.software.usertransactions.infrastructure.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.koleszko.software.usertransactions.domainmodel.employee.Employee;
import pl.koleszko.software.usertransactions.domainmodel.shared.annotation.Dao;

import javax.persistence.EntityManager;

import static lombok.AccessLevel.PACKAGE;

@Repository
@RequiredArgsConstructor(access = PACKAGE)
class EmployeeCustomDaoImpl implements EmployeeCustomDao {

    private final EntityManager entityManager;

    @Override
    public void insert(Employee employee) {
        entityManager.persist(employee);
    }
}
