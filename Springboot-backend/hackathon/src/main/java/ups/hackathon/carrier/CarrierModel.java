package ups.hackathon.carrier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import ups.hackathon.trackingInfo.TrackingInfoModel;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carrier")
public class CarrierModel {

    // non-parameterized constructor for hibernate
    public CarrierModel(){

    }

    public CarrierModel(String carrierName){

        this.carrierName = carrierName;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "carrier")
    @JsonIgnore
    private List<TrackingInfoModel> trackingInfoModels = new ArrayList<>();


    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long carrierId;


    @Column(name = "name")
    private String carrierName;


    public Long getCarrierId() {
        return carrierId;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public List<TrackingInfoModel> getTrackingInfoModels() {
        return trackingInfoModels;
    }

    public void setTrackingInfoModels(List<TrackingInfoModel> trackingInfoModels) {
        this.trackingInfoModels = trackingInfoModels;
    }
}
