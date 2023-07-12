package ups.hackathon.origin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class OriginController {
    @Autowired // Injected Singleton
    private final OriginService originService;

    //Constructor
    public OriginController(OriginService originService) {
        this.originService = originService;
    }



    @GetMapping("/origins")
    public List<OriginModel> getAllOrigins(){
        return originService.getAllOrigins();
    }


    @GetMapping("/origins/{originID}")
    public Optional<OriginModel> getOriginById(@PathVariable Long originID){
        return originService.getOriginById(originID);
    }
}
