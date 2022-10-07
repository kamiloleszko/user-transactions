package pl.koleszko.software.usertransactions.domainmodel.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

import static lombok.AccessLevel.PRIVATE;

@MappedSuperclass
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 5945113578924098876L;

    @UpdateTimestamp
    protected LocalDateTime modificationDate;

    @CreationTimestamp
    protected LocalDateTime creationDate;

    protected boolean deleted;
}
