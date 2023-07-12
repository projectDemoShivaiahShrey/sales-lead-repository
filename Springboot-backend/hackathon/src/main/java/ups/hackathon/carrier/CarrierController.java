package ups.hackathon.carrier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class CarrierController {
    @Autowired // Injected Singleton
    private final CarrierService carrierService;

    //Constructor
    public CarrierController(CarrierService carrierService) {
        this.carrierService = carrierService;
    }



    @GetMapping("/carriers")
    public List<CarrierModel> getAllCarriers(){
        return carrierService.getAllCarriers();
    }


    @GetMapping("/carriers/{carrierID}")
    public Optional<CarrierModel> getCarrierById(@PathVariable Long carrierID){
        return carrierService.getCarrierById(carrierID);
    }
}
