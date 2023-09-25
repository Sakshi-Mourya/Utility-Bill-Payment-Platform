import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowallinvoiceComponent } from './showallinvoice.component';

describe('ShowallinvoiceComponent', () => {
  let component: ShowallinvoiceComponent;
  let fixture: ComponentFixture<ShowallinvoiceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowallinvoiceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowallinvoiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
