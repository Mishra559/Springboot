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
public class Course {
    @Id
    private Integer id;
    private String courseName;


    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "STUDENT_COURSE",
    joinColumns = @JoinColumn(name = "CID_FK"),
    inverseJoinColumns = @JoinColumn(name = "SID_FK"))
    private List<Student> students =  new ArrayList<>();

    public Course(Integer id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }
}
