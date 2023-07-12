package ups.hackathon.origin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OriginService {
    @Autowired // Injected Singleton
    private final OriginRepository originRepository;


    //Constructor
    public OriginService(OriginRepository originRepository) {
        this.originRepository = originRepository;
    }


    public List<OriginModel> getAllOrigins(){
        return originRepository.findAll();
    }

    public Optional<OriginModel> getOriginById(Long id){
        return originRepository.findById(id);
    }

}
