package ups.hackathon.carrier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarrierService {
    @Autowired // Injected Singleton
    private final CarrierRepository carrierRepository;


    //Constructor
    public CarrierService(CarrierRepository carrierRepository) {

        this.carrierRepository = carrierRepository;
    }


    public List<CarrierModel> getAllCarriers(){
        return carrierRepository.findAll();
    }

    public Optional<CarrierModel> getCarrierById(Long id){
        return carrierRepository.findById(id);
    }

}
