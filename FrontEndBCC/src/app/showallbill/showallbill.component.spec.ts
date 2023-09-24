import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowallbillComponent } from './showallbill.component';

describe('ShowallbillComponent', () => {
  let component: ShowallbillComponent;
  let fixture: ComponentFixture<ShowallbillComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowallbillComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowallbillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
