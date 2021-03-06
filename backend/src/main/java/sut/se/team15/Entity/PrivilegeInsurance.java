package sut.se.team15.Entity;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "Privilege_Insurance")
public class PrivilegeInsurance {
    @Id
    @SequenceGenerator(name = "Privilege_Insurance_SEQ", sequenceName = "Privilege_Insurance_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Privilege_Insurance_SEQ")
    @Column(name = "Privilege_Insurance_ID", unique = true, nullable = true)

    private @NonNull Long id;
}