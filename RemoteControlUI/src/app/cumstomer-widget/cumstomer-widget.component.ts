import { Component } from '@angular/core';
import { Client } from 'src/app/Models/Client';
import { CustomerWidgetService } from 'src/app/Services/customer-widget-service.service';

@Component({
  selector: 'app-cumstomer-widget',
  templateUrl: './cumstomer-widget.component.html',
  styleUrls: ['./cumstomer-widget.component.scss'],
})
export class CumstomerWidgetComponent {
  constructor(private customerWidgetService: CustomerWidgetService) {}
  clients: Client[] = [];
  ngOnInit(): void {
    //this.customerWidgetService.getAllClients().subscribe((result: Client[]) => {
      //this.clients = result;
      // console.log(result.length);
    //});
    this.clients = [ 
      {clientID : 1, clientName : "Macy's"},
      {clientID : 2, clientName: "Walmart"},
      {clientID : 3, clientName: "Michael's"},
      {clientID : 4, clientName: "Target"},
      {clientID : 5, clientName: "ToysrUs"},
      {clientID : 6, clientName: "Apple"}
    ]
  }
}
