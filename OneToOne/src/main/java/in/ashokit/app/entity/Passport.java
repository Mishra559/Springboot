package in.ashokit.app.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passport {

    @Id
    private String id;
    private LocalDate expiryDate;
    @OneToOne(cascade = CascadeType.ALL)


    @JoinColumn(name = "pid_fk")
    Person person;
}
