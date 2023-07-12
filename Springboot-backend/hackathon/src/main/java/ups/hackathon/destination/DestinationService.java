package ups.hackathontest.destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinationService {
    @Autowired // Injected Singleton
    private final DestinationRepository destinationRepository;

    //Constructor
    public DestinationService(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }
}
