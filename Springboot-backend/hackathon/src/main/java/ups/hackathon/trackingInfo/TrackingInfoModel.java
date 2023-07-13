package ups.hackathon.trackingInfo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import ups.hackathon.carrier.CarrierModel;
import ups.hackathon.client.ClientModel;
import ups.hackathon.destination.DestinationModel;
import ups.hackathon.origin.OriginModel;

import java.time.LocalDateTime;


@Entity
@Table(name = "trackingInfo")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TrackingInfoModel {

    // non-parameterized constructor for hibernate
    public TrackingInfoModel(){

    }

    public TrackingInfoModel(LocalDateTime packageProcessed, LocalDateTime packageDelivered){
        this.packageProcessed = packageProcessed;
        this.packageDelivered = packageDelivered;
    }

    @ManyToOne()
    @JoinColumn(name = "fk_carrier", referencedColumnName="id")
    private CarrierModel carrier;


    @ManyToOne()
    @JoinColumn(name = "fk_client", referencedColumnName="id")
    private ClientModel client;

    @ManyToOne()
    @JoinColumn(name = "fk_origin", referencedColumnName="id")
    private OriginModel origin;


    @ManyToOne()
    @JoinColumn(name = "fk_destination")
    private DestinationModel destination;


    @Id //pk
    @Column(name = "tracking_num")
    private String trackingNumber;


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

    public String getTrackingNumber() {
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

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public void setPackageProcessed(LocalDateTime packageProcessed) {
        this.packageProcessed = packageProcessed;
    }

    public void setPackageDelivered(LocalDateTime packageDelivered) {
        this.packageDelivered = packageDelivered;
    }

}
