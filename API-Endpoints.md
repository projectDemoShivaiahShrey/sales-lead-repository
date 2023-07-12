## Backend API Endpoints

before we deploy to azure, we'll use the localhost url
base : localhost:8080/api

---
### Tracking Info Routes

<ul>

<li> GET ALL TRACKING INFO "/trackingInfo/ "</li>
<li> GET TRACKING INFO BY TRACKING NUM "/trackingInfo/{trackingNum}" </li>
<li> POST w/ request body of a trackingInfo "/trackingInfo/" </li>
<li> PUT w/ request body of a trackingInfo "/trackingInfo/{trackingNum}"</li>
<li> DELETE /trackingInfo/{trackingNum}  </li>

</ul>

---

### Client Routes

<ul>

<li> GET ALL CLIENTS, or optionally clients for a specific tracking number by providing a query param "/clients/?trackingNum= "</li>
<li> GET CLIENT BY ID "/clients/{clientID}" </li>
<li> POST w/ request body of a client, with required trackingNum "/clients/?trackingNum= " </li>
<li> PUT w/ request body of a client "/clients/{clientID}"</li>
<li> DELETE /clients/{clientID}  </li>

</ul>

---

### Carrier Routes

<ul>

<li> GET ALL CARRIERS, or optionally carriers for a specific tracking number by providing a query param "/carriers/?trackingNum= "</li>
<li> GET CARRIER BY ID "/carriers/{carrierID}" </li>
<li> POST w/ request body of a carrier, with required trackingNum "/carriers/?trackingNum=" </li>
<li> PUT w/ request body of a carrier "/carriers/{carrierID}"</li>
<li> DELETE /carriers/{carrierID}  </li>

<br>    


</ul>

---

### Origin Routes

<ul>

<li> GET ALL ORIGINS, or optionally origins for a specific tracking number by providing a query param "/origins/?trackingNum= "</li>
<li> GET ORIGIN BY ID "/origins/{originID}" </li>
<li> POST w/ request body of a origin, with required trackingNum "/origins/?trackingNum=" </li>
<li> PUT w/ request body of a origin "/origins/{originID}"</li>
<li> DELETE /origins/{originID}  </li>

</ul>

---

### Destination Routes

<ul>

<li> GET ALL DESTINATIONS, or optionally destinations for a specific tracking number by providing a query param "/destinations/?trackingNum= "</li>
<li> GET DESTINATION BY ID "/destinations/{destinationID}" </li>
<li> POST w/ request body of a destination, with required trackingNum "/destinations/?trackingNum=" </li>
<li> PUT w/ request body of a destination "/destinations/{destinationID}"</li>
<li> DELETE /destinations/{destinationID}  </li>

</ul>

---