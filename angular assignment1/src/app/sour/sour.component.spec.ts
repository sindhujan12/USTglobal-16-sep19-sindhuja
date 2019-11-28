import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SourComponent } from './sour.component';

describe('SourComponent', () => {
  let component: SourComponent;
  let fixture: ComponentFixture<SourComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SourComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
