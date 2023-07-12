package ups.hackathon.trackingInfo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import ups.hackathon.carrier.CarrierModel;
import ups.hackathon.client.ClientModel;
import ups.hackathon.destination.DestinationModel;
import ups.hackathon.origin.OriginModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "trackingInfo")
public class TrackingInfoModel {

    // non-parameterized constructor for hibernate
    public TrackingInfoModel(){

    }

    public TrackingInfoModel(Date packageProcessed, Date packageDelivered, Long clientId, Long originId, Long destinationId, Long carrierId ){
        this.packageProcessed = packageProcessed;
        this.packageDelivered = packageDelivered;
        this.clientId = clientId;
        this.originId = originId;
        this.destinationId = destinationId;
        this.carrierId = carrierId;
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


    @Temporal(TemporalType.DATE) //json format date
    @Column(name = "package_processed")
    private Date packageProcessed;

    @Temporal(TemporalType.DATE) //json format date
    @Column(name = "package_delivered")
    private Date packageDelivered;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "origin_id")
    private Long originId;

    @Column(name = "destination_id")
    private Long destinationId;

    @Column(name = "carrier_id")
    private Long carrierId;


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

    public Date getPackageProcessed() {
        return packageProcessed;
    }

    public Date getPackageDelivered() {
        return packageDelivered;
    }

    public Long getClientId() {
        return clientId;
    }

    public Long getOriginId() {
        return originId;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public Long getCarrierId() {
        return carrierId;
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

    public void setPackageProcessed(Date packageProcessed) {
        this.packageProcessed = packageProcessed;
    }

    public void setPackageDelivered(Date packageDelivered) {
        this.packageDelivered = packageDelivered;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public void setOriginId(Long originId) {
        this.originId = originId;
    }

    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }
}
