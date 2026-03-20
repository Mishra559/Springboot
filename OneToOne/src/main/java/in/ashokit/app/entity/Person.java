package in.ashokit.app.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    private Integer id;
    private String name;



    @OneToOne(cascade = CascadeType.ALL,mappedBy = "person")
    private Passport passport;

}
