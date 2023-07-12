package ups.hackathon.trackingInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class TrackingInfoController {
    @Autowired // Injected Singleton
    private final TrackingInfoService trackingInfoService;

    //Constructor
    public TrackingInfoController(TrackingInfoService trackingInfoService) {
        this.trackingInfoService = trackingInfoService;
    }

}
