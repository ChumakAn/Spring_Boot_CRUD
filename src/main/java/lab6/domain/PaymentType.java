package lab6.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "payment_type")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class PaymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column (name = "type", length = 15)
    private String type;

    @Override
    public String toString(){
        return "Payment type ["
                + "id =" + id + ", "
                + "type = " + type
                + "];"  + "\n";
    }
}
