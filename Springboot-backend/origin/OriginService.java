package ups.hackathontest.origin;

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
}
