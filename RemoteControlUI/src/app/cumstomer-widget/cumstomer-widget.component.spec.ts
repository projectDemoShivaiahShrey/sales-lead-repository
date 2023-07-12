import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CumstomerWidgetComponent } from './cumstomer-widget.component';

describe('CumstomerWidgetComponent', () => {
  let component: CumstomerWidgetComponent;
  let fixture: ComponentFixture<CumstomerWidgetComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CumstomerWidgetComponent]
    });
    fixture = TestBed.createComponent(CumstomerWidgetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
