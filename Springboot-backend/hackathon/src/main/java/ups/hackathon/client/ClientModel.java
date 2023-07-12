package ups.hackathon.client;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import ups.hackathon.trackingInfo.TrackingInfoModel;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
public class ClientModel {

    // non-parameterized constructor for hibernate
    public ClientModel(){

    }

    public ClientModel(String clientName){
        this.clientName = clientName;
    }

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "trackingInfo")
    private List<TrackingInfoModel> trackingInfoModels = new ArrayList<>();


    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long clientId;


    @Column(name = "name")
    private String clientName;

    public Long getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public List<TrackingInfoModel> getTrackingInfoModels() {
        return trackingInfoModels;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setTrackingInfoModels(List<TrackingInfoModel> trackingInfoModels) {
        this.trackingInfoModels = trackingInfoModels;
    }
}
