package pl.koleszko.software.usertransactions.infrastructure.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.koleszko.software.usertransactions.domainmodel.employee.Employee;

import javax.persistence.EntityManager;

import static lombok.AccessLevel.PACKAGE;

@Repository
@RequiredArgsConstructor(access = PACKAGE)
class EmployeeCustomDaoImpl implements EmployeeCustomDao {

    private final EntityManager entityManager;

    @Override
    @Transactional
    public void insert(Employee employee) {
        entityManager.persist(employee);
    }
}
