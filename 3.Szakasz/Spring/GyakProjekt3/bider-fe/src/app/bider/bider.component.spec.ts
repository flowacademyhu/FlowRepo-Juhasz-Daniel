import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BiderComponent } from './bider.component';

describe('BiderComponent', () => {
  let component: BiderComponent;
  let fixture: ComponentFixture<BiderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BiderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BiderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
