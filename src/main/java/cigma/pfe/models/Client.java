package cigma.pfe.models;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client {
    @Id
// GenerationType.IDENTITY n’est pas permise si
// La stratégie d'héritage est TABLE_PER_CLASS
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public Client() {
    }
}