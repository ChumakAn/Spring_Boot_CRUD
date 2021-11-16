package lab6.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "route")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date", length = 10)
    private String date;
    @ManyToOne
    @JoinColumn(name = "guide_id", referencedColumnName = "id", nullable = false)
    private Guide guide;
    @Column(name = "name", length = 45)
    private String name;

    @Override
    public String toString() {
        return "Route ["
                + "id = " + id + ", "
                + "date = " + date
                + "guideId = " + guide.getId()
                + "name = " + name
                + "];" + "\n";

    }
}
