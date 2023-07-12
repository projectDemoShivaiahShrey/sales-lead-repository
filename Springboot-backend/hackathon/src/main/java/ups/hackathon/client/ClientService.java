package ups.hackathontest.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired // Injected Singleton
    private final ClientRepository clientRepository;

    //Constructor
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
}
