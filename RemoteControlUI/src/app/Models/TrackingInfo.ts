import { Client } from "./Client";
import { Destination } from "./Destination";
import { Origin } from "./Origin";
import { Carrier } from "./Carrier";

export class TrackingInfo {
    carrier : Carrier = new Carrier();
    client : Client = new Client();
    origin : Origin = new Origin();
    destination : Destination = new Destination();
    trackingNumber : number = 0;
    packageProcessed : string = "";
    packageDelivered : string = "";
}