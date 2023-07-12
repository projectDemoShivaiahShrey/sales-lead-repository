package ups.hackathon.origin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class OriginController {
    @Autowired // Injected Singleton
    private final OriginService originService;

    //Constructor
    public OriginController(OriginService originService) {
        this.originService = originService;
    }

}
