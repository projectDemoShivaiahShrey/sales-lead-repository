package ups.hackathon.trackingInfo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import ups.hackathon.carrier.CarrierModel;
import ups.hackathon.client.ClientModel;
import ups.hackathon.destination.DestinationModel;
import ups.hackathon.origin.OriginModel;

import java.time.LocalDateTime;


@Entity
@Table(name = "trackingInfo")
public class TrackingInfoModel {

    // non-parameterized constructor for hibernate
    public TrackingInfoModel(){

    }

    public TrackingInfoModel(LocalDateTime packageProcessed, LocalDateTime packageDelivered){
        this.packageProcessed = packageProcessed;
        this.packageDelivered = packageDelivered;
    }

    //M:1 with User
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_carrier")
    @JsonIgnore
    private CarrierModel carrier;

    //M:1 with User
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_client")
    @JsonIgnore
    private ClientModel client;

    //M:1 with User
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_origin")
    @JsonIgnore
    private OriginModel origin;

    //M:1 with User
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_destination")
    @JsonIgnore
    private DestinationModel destination;


    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tracking_num")
    private Long trackingNumber;


    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "package_processed")
    private LocalDateTime packageProcessed;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "package_delivered")
    private LocalDateTime packageDelivered;


    public CarrierModel getCarrier() {
        return carrier;
    }

    public ClientModel getClient() {
        return client;
    }

    public OriginModel getOrigin() {
        return origin;
    }

    public DestinationModel getDestination() {
        return destination;
    }

    public Long getTrackingNumber() {
        return trackingNumber;
    }

    public LocalDateTime getPackageProcessed() {
        return packageProcessed;
    }

    public LocalDateTime getPackageDelivered() {
        return packageDelivered;
    }


    public void setCarrier(CarrierModel carrier) {
        this.carrier = carrier;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }

    public void setOrigin(OriginModel origin) {
        this.origin = origin;
    }

    public void setDestination(DestinationModel destination) {
        this.destination = destination;
    }

    public void setTrackingNumber(Long trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public void setPackageProcessed(LocalDateTime packageProcessed) {
        this.packageProcessed = packageProcessed;
    }

    public void setPackageDelivered(LocalDateTime packageDelivered) {
        this.packageDelivered = packageDelivered;
    }

}
