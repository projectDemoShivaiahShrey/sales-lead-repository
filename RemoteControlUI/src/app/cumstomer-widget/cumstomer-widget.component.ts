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
    this.customerWidgetService.getAllClients().subscribe((result: Client[]) => {
      this.clients = result;
      console.log(this.clients[0].clientName);
      // console.log(result.length);
    });
    /*this.clients = [ 
      {ClientID : 1, ClientName : "Macy's"},
      {ClientID : 2, ClientName: "Walmart"},
      {ClientID : 3, ClientName: "Michael's"},
      {ClientID : 4, ClientName: "Target"},
      {ClientID : 5, ClientName: "ToysrUs"},
      {ClientID : 6, ClientName: "Apple"}
    ]
    */
    console.log(this.clients.length);
  }
}
