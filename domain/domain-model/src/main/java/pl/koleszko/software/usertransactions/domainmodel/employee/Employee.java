package pl.koleszko.software.usertransactions.domainmodel.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import pl.koleszko.software.usertransactions.domainmodel.entity.BaseEntity;

import javax.persistence.*;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PRIVATE)
public class Employee extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_ID_SEQUENCE")
    @SequenceGenerator(name = "EMPLOYEE_ID_SEQUENCE", sequenceName = "EMPLOYEE_ID_SEQUENCE", allocationSize = 1)
    private Long employeeId;

    private String firstName;

    private String lastName;
}
