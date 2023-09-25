import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowalltransactionComponent } from './showalltransaction.component';

describe('ShowalltransactionComponent', () => {
  let component: ShowalltransactionComponent;
  let fixture: ComponentFixture<ShowalltransactionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowalltransactionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowalltransactionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
