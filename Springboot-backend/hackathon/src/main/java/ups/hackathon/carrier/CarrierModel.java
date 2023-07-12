package ups.hackathon.carrier;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrier")
public class CarrierModel {

    // non-parameterized constructor for hibernate
    public CarrierModel(){

    }
}
