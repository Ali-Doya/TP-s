package cigma.pfe.services;


import cigma.pfe.dao.ClientDao;
import cigma.pfe.models.Client;

public class ClientServiceImpl implements ClientService {

    private ClientDao dao;
    public void setDao(ClientDao dao)  {
        this.dao = dao;
    }

    @Override
    public Client save(Client c)  {
        return dao.save(c);
    }

    @Override
    public Client modify(Client c)  {
        return dao.update(c);
    }

    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }

    @Override
    public Client getById(long id) {
        return dao.findById(id);
    }
}

