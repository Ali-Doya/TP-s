package cigma.pfe.presentation;


import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.ClientService;

@Controller("ctrl1")
public class ClientController {
    private ClientService service;

    public void save(Client person) {
        service.save(person);
    }

    public ClientController() {
        System.out.println("creation bean controller");
    }
}

