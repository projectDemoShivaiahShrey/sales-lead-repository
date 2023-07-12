package ups.hackathontest.trackingInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackingInfoService {
    @Autowired // Injected Singleton
    private final TrackingInfoRepository trackingInfoRepository;

    //Constructor
    public TrackingInfoService(TrackingInfoRepository trackingInfoRepository) {
        this.trackingInfoRepository = trackingInfoRepository;
    }
}
