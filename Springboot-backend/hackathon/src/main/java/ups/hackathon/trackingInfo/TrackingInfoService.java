package ups.hackathon.trackingInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<TrackingInfoModel> getTrackingInfoByTrackingNum(Long trackingNum){
        return trackingInfoRepository.findById(trackingNum);
    }


}
