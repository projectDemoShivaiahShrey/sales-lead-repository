package ups.hackathontest.carrier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class CarrierController {
    @Autowired // Injected Singleton
    private final CarrierService carrierService;

    //Constructor
    public CarrierController(CarrierService carrierService) {
        this.carrierService = carrierService;
    }

}
