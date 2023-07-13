import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { TrackingInfo } from '../Models/TrackingInfo';
import { CustomerWidgetService } from 'src/app/Services/customer-widget-service.service';
import { Carrier } from '../Models/Carrier';
import { Client } from '../Models/Client';
import { Origin } from '../Models/Origin';
import { Destination } from '../Models/Destination';

@Component({
  selector: 'app-view-more',
  templateUrl: './view-more.component.html',
  styleUrls: ['./view-more.component.scss']
})
export class ViewMoreComponent {
    carrierName : string[] = [];
    origin : string[] = [];
    destination : string[] = [];
    packageProcessed : string[] = [];
    packageDelivered : string[] = [];

    clientId : number = 0;
    trackingInfo : TrackingInfo[] = [];

    constructor(private route : ActivatedRoute, private service : CustomerWidgetService) {}

    ngOnInit() {
      this.clientId = +this.route.snapshot.paramMap.get('clientID')!;
      this.service.getAllTracking().subscribe((result) => this.trackingInfo = result);
      this.trackingInfo.forEach(element => {
        if (element.carrier.carrierName != "UPS") {
          this.carrierName.concat(element.carrier.carrierName);
          this.origin.concat(element.origin.city);
          this.destination.concat(element.destination.city);
          this.packageProcessed.concat(element.packageProcessed);
          this.packageDelivered.concat(element.packageDelivered);
        }
      });
    }
}
