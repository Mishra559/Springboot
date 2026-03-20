package in.ashokit.app.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    @GenericGenerator(name= "mygen", strategy = "in.ashokit.app.generator.MyGenerator")
    @GeneratedValue(generator = "mygen")
//    @SequenceGenerator(sequenceName = "My_seq",allocationSize = 2,name = "seq1")
//    @TableGenerator(name = "seq1",
//                    table = "id_table",
//                    pkColumnName = "id_key",
//                    valueColumnName = "id_value",
//                    pkColumnValue="stu_id",
//                    allocationSize=2)
    private Integer id;
    private String name;
    private Double marks;
}
