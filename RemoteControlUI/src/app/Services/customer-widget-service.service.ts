import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { Client } from 'src/app/Models/Client';
import { TrackingInfo } from '../Models/TrackingInfo';

@Injectable({
  providedIn: 'root',
})
export class CustomerWidgetService {
  constructor(private http: HttpClient) {}
  apiUrl = 'http://localhost:8080/api/';
  public getAllClients(): Observable<Client[]> {
    return this.http.get<Client[]>(this.apiUrl + 'clients');
  }
  public getAllTracking(): Observable<TrackingInfo[]> {
    return this.http.get<TrackingInfo[]>(this.apiUrl + 'trackingInfo');
  }
}
