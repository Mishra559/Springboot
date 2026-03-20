package in.ashokit.app.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@NamedQuery(name="Orders.fetchAllByDate",query= "SELECT o FROM Orders o where o.orderDate = ?1")
public class Orders {
    @Id
    private Long id;
    private LocalDate orderDate;


    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
