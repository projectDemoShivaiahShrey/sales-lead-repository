package ups.hackathon.trackingInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.hackathon.carrier.CarrierModel;

import java.util.List;

@Service
public class TrackingInfoService {
    @Autowired // Injected Singleton
    private final TrackingInfoRepository trackingInfoRepository;

    //Constructor
    public TrackingInfoService(TrackingInfoRepository trackingInfoRepository) {
        this.trackingInfoRepository = trackingInfoRepository;
    }

    public List<TrackingInfoModel> getAllTrackingInfo(){
        return trackingInfoRepository.findAll();
    }
}
