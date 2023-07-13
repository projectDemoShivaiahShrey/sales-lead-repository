import { TestBed } from '@angular/core/testing';

import { CustomerWidgetService } from './Services/customer-widget-service.service';

describe('CustomerWidgetServiceService', () => {
  let service: CustomerWidgetService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CustomerWidgetService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
