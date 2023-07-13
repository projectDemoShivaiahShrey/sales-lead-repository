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
  styleUrls: ['./view-more.component.scss'],
})
export class ViewMoreComponent {
  carrierName: string[] = [];
  origin: any[] = [];
  destination: any[] = [];
  packageProcessed: string[] = [];
  packageDelivered: string[] = [];
  trackingNum: number[] = [];
  client: String = '';

  clientId: number = 0;
  trackingInfo: TrackingInfo[] = [];

  constructor(
    private route: ActivatedRoute,
    private service: CustomerWidgetService
  ) {}

  ngOnInit() {
    this.carrierName = [];
    this.clientId = +this.route.snapshot.paramMap.get('clientID')!;
    this.service.getAllTracking().subscribe((result) => {
      this.trackingInfo = result;
      this.trackingInfo.forEach((element) => {
        if (
          element.carrier.carrierName != 'UPS' &&
          element.client.clientId == this.clientId
        ) {
          this.trackingNum.push(element.trackingNumber);
          this.carrierName.push(element.carrier.carrierName);
          this.origin.push(element.origin);
          this.destination.push(element.destination);
          this.packageProcessed.push(element.packageProcessed);
          this.packageDelivered.push(element.packageDelivered);
          this.client = element.client.clientName;
        }
      });
      console.log(this.carrierName);
      console.log(this.origin);
      console.log(this.destination);
      console.log(this.packageProcessed);
      console.log(this.packageDelivered);
    });
  }
}
