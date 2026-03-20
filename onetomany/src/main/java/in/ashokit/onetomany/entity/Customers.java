package in.ashokit.onetomany.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import in.ashokit.onetomany.entity.Order;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customers {

    @Id
    private Integer id;

    private String name;

@OneToMany(cascade= CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    private List<Order> orders;


}
