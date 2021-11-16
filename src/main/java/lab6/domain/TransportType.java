package lab6.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "transport_type")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class TransportType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", length = 45)
    private String name;

    @Override
    public String toString() {
        return "Transport Type ["
                + "id = " + id + ", "
                + "name = " + name
                + "];" + "\n";

    }
}