package ups.hackathon.destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class DestinationController {
    @Autowired // Injected Singleton
    private final DestinationService destinationService;

    //Constructor
    public DestinationController(DestinationService destinationService) {
        this.destinationService = destinationService;
    }

}
