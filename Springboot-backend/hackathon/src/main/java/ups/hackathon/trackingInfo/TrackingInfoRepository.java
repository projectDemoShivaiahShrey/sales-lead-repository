package ups.hackathon.trackingInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingInfoRepository extends JpaRepository<TrackingInfoModel, String> {

}
