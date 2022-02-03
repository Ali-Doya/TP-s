package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;


public class ClientServiceImpl implements ClientService {


    @Override
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }

    ClientRepository clientRepository ;
    public ClientServiceImpl(ClientRepository clientRepository) {
        System.out.println("Call ClientServiceImpl with ClientRepository param....");
        this.clientRepository = clientRepository;
    }
    }

