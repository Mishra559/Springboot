package in.ashokit.app.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    @Id
    private Integer id;
    private String studentName;


    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "students")
    private List<Course> courses=new ArrayList<>();
}
