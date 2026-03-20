package in.ashokit.app.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "EMP")
public class Employee {
    @Id
    @Column(name = "EMPNO")
    private Integer empno;

    @Column(name = "ENAME")
    private String ename;

    @Column(name = "SAL")
    private Double sal;

    @Column(name = "DEPARTMENT")
    private String department;
}
