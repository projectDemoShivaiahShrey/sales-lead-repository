package ups.hackathon.client;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/")
public class ClientController {
    @Autowired // Injected Singleton
    private final ClientService clientService;

    //Constructor
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public List<ClientModel> getAllClients(){
        return clientService.getAllClients();
    }


    @GetMapping("/clients/{clientID}")
    public Optional<ClientModel> getClientById(@PathVariable Long clientID){
        return clientService.getClientById(clientID);
    }

}
