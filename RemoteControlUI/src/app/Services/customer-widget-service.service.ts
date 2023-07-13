import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { Client } from 'src/app/Models/Client';

@Injectable({
  providedIn: 'root'
})
export class CustomerWidgetService {
  constructor(private http: HttpClient) {}
  apiUrl = "http://localhost:8080/";
  public getAllClients() : Observable<Client[]> {
    return this.http.get<Client[]>(this.apiUrl + "clients")
  }
}
