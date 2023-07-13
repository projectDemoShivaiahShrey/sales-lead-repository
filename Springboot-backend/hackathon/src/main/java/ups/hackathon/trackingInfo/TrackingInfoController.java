package ups.hackathon.trackingInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class TrackingInfoController {
    @Autowired // Injected Singleton
    private final TrackingInfoService trackingInfoService;

    //Constructor
    public TrackingInfoController(TrackingInfoService trackingInfoService) {
        this.trackingInfoService = trackingInfoService;
    }

    @GetMapping("/trackingInfo")
    public List<TrackingInfoModel> getAllTrackingInfo(){
        return trackingInfoService.getAllTrackingInfo();
    }


    @GetMapping("/trackingInfo/{trackingNum}")
    public Optional<TrackingInfoModel> getTrackingInfoByTrackingNum(@PathVariable String trackingNum){
        return trackingInfoService.getTrackingInfoByTrackingNum(trackingNum);
    }

}
