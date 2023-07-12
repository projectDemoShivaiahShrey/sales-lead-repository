package ups.hackathon.destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class DestinationController {
    @Autowired // Injected Singleton
    private final DestinationService destinationService;

    //Constructor
    public DestinationController(DestinationService destinationService) {
        this.destinationService = destinationService;
    }

    @GetMapping("/destinations")
    public List<DestinationModel> getAllDestinations(){
        return destinationService.getAllDestinations();
    }


    @GetMapping("/destinations/{destinationID}")
    public Optional<DestinationModel> getDestinationById(@PathVariable Long destinationID){
        return destinationService.getDestinationById(destinationID);
    }

}
