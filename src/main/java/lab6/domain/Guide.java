package lab6.domain;


import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Table(name = "guide")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", length = 30)
    private String name;
    @Column(name = "surname", length = 30)
    private String surname;
    @Column(name = "telephone_number", length = 12)
    private String telephoneNumber;
    @OneToMany(mappedBy = "guide", fetch = FetchType.EAGER)
    private Collection<Route> routes;

    public Guide(Integer id, String name, String surname, String telephoneNumber){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString(){
        return "Guide ["
                + "id =" + id + ", "
                + "name = " + name + ", "
                + "surname = " + surname + ", "
                + "telephone number = " + telephoneNumber
                + "];"  + "\n";
    }
}
