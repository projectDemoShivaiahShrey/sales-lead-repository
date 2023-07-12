package ups.hackathontest.client;

import org.springframework.beans.factory.annotation.Autowired;
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

}
