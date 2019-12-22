import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LibhomeComponent } from './libhome.component';

describe('LibhomeComponent', () => {
  let component: LibhomeComponent;
  let fixture: ComponentFixture<LibhomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LibhomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LibhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
