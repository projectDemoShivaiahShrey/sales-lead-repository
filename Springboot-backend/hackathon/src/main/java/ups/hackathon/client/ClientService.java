package ups.hackathon.client;

import java.util.List;
import java.util.Optional;

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

        public List<ClientModel> getAllClients(){
        return clientRepository.findAll();
    }

    public Optional<ClientModel> getClientById(Long id){
        return clientRepository.findById(id);
    }
}
