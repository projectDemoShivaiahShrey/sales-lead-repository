package ups.hackathontest.trackingInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "trackingInfo")
public class TrackingInfoModel {

    // non-parameterized constructor for hibernate
    public TrackingInfoModel(){

    }
}
