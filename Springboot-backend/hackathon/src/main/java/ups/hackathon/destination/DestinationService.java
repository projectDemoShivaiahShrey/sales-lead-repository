package ups.hackathon.destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DestinationService {
    @Autowired // Injected Singleton
    private final DestinationRepository destinationRepository;

    //Constructor
    public DestinationService(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    public List<DestinationModel> getAllDestinations(){
        return destinationRepository.findAll();
    }

    public Optional<DestinationModel> getDestinationById(Long id){

        return destinationRepository.findById(id);
    }
}
