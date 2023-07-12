package ups.hackathon.destination;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import ups.hackathon.trackingInfo.TrackingInfoModel;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "destination")
public class DestinationModel {

    // non-parameterized constructor for hibernate
    public DestinationModel(){

    }

    public DestinationModel(String street, String city, String state, String ZIP){
        this.street = street;
        this.city = city;
        this.state = state;
        this.ZIP = ZIP;
    }

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "destination")
    private List<TrackingInfoModel> trackingInfoModels = new ArrayList<>();

    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long locationID;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "ZIP")
    private String ZIP;

    public List<TrackingInfoModel> getTrackingInfoModels() {
        return trackingInfoModels;
    }

    public void setTrackingInfoModels(List<TrackingInfoModel> trackingInfoModels) {
        this.trackingInfoModels = trackingInfoModels;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZIP() {
        return ZIP;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
    }

    public Long getLocationID() {
        return locationID;
    }

    public void setLocationID(Long locationID) {
        this.locationID = locationID;
    }
}
