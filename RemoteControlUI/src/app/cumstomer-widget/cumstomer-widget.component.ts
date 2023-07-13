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
       console.log(result.length);
    });
    /*this.clients = [ 
      {clientId : 1, clientName : "Macy's"},
      {clientId : 2, clientName: "Walmart"},
      {clientId : 3, clientName: "Michael's"},
      {clientId : 4, clientName: "Target"},
      {clientId : 5, clientName: "ToysrUs"},
      {clientId : 6, clientName: "Apple"}
    ]
    */
  }
}
