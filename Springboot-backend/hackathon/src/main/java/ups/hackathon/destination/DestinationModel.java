package ups.hackathon.destination;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "destination")
public class DestinationModel {

    // non-parameterized constructor for hibernate
    public DestinationModel(){

    }
}
