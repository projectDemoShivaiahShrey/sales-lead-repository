package ups.hackathontest.client;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class ClientModel {

    // non-parameterized constructor for hibernate
    public ClientModel(){

    }
}
