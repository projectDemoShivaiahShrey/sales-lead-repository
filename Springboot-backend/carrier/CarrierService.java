package ups.hackathontest.carrier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrierService {
    @Autowired // Injected Singleton
    private final CarrierRepository carrierRepository;

    //Constructor
    public CarrierService(CarrierRepository carrierRepository) {
        this.carrierRepository = carrierRepository;
    }
}
