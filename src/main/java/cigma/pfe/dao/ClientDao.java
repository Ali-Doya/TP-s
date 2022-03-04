package cigma.pfe.dao;

import cigma.pfe.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends CrudRepository<Client, Long> {

    Client save(Client c);

    Client update(Client c);

    void deleteById(long idClient);

    Client findById(long idClient);

}

